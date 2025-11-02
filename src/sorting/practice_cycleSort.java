package sorting;

import java.util.Arrays;

public class practice_cycleSort {
    public static void main(String[] args) {
        int[] arr={0,1,3,2,4};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            if(arr[i] != i)
            {
                int correctindex = arr[i];
                int temp = arr[correctindex];
                arr[correctindex]=arr[i];
                arr[i]=temp;
            }
            else {
                i++;
            }
        }return arr;
    }
}
