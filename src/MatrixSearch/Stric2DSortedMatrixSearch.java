package MatrixSearch;

import java.util.Arrays;

public class Stric2DSortedMatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(matrix, 90)));
    }

    static int[] binarySearch(int[][] matrix, int row, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;

        if (column == 0) return new int[]{-1, -1};

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = column / 2;

        // Narrow down to two rows
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid + 1;
            } else {
                rEnd = mid - 1;
            }
        }

        // Check middle column of two remaining rows
        if (matrix[rStart][cMid] == target) return new int[]{rStart, cMid};
        if (rStart + 1 < row && matrix[rStart + 1][cMid] == target) return new int[]{rStart + 1, cMid};

        // 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][column - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, column - 1, target);
        }
        // 3rd half
        if (rStart + 1 < row && target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        // 4th half
        else if (rStart + 1 < row) {
            return binarySearch(matrix, rStart + 1, cMid + 1, column - 1, target);
        }

        return new int[]{-1, -1};
    }
}
