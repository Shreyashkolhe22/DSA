package linearSearch;

import java.util.Arrays;

public class MaxArr {
    public static void main(String[] args) {
        int[] arr={22,33,44,66,11};
        int max=arr[0];
        System.out.println(Arrays.toString(arr));
        System.out.println(maxEle(arr,max,0,2));
    }

    static int maxEle(int[] arr, int max,int start,int end) {
        for (int i = start; i <=end; i++) {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }return max;
    }
}
