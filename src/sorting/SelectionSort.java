package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,3,4,2,1};
        System.out.println(Arrays.toString(sort(arr)));

    }

    static int[] sort(int[] arr)
    {
        int n=arr.length-1;
        for (int i = 0; i < n; i++) {
            int max=0;
            for (int j = 0; j <= n-i; j++) {
                if(arr[j]>arr[max])
                {
                    max=j;
                }
            }
            int temp=arr[max];
            arr[max]=arr[n-i];
            arr[n-i]=temp;
        }
        return arr;
    }
}

