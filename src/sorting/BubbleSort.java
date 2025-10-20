package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={9,5,3,4,2,7};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr)
    {
        int n=arr.length;
        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n-i; j++) {

                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }return arr;
    }
}
