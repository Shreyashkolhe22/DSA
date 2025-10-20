import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={22,44,66,77,99};
        System.out.println(Arrays.toString(arr));
        arrreverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void arrreverse(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start<end)
        {
            swaparr(arr,start,end);
            start++;
            end--;
        }

    }
    static void swaparr(int[] arr, int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
