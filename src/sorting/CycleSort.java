package sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr={3,2,1,4};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr)
    {
        int i=0;
        while (i < arr.length){
            if(arr[i] != i+1)
            {
                int correctindex=arr[i]-1;
                int temp=arr[i];
                arr[i]=arr[correctindex];
                arr[correctindex]=temp;
            }

            else {
                i++;
            }
        }
        return arr;
    }
}
