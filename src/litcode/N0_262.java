package litcode;

import java.util.Arrays;

public class N0_262 {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(find(arr));
    }

    static int find(int[] arr)
    {
        int n=arr.length;
        int toatalsum=n * (n+1) /2;

        int cunnentsum=0;
        for (int i = 0; i < arr.length; i++) {
            cunnentsum += arr[i];
        }

        if(cunnentsum < toatalsum)
        {
            return toatalsum-cunnentsum;
        }
        return 0;
    }
}
