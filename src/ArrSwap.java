import java.util.Arrays;

public class ArrSwap {
    public static void main(String[] args) {
        int[] arr={12,43,56,78,98};
        System.out.println(Arrays.toString(arr));
        swaparr(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }

    static void swaparr(int[] arr, int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
