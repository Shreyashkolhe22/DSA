import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int a=20;
        chnage(a);
        System.out.println(a);

        arrchnage(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void chnage(int a)
    {
        a=100;
        System.out.println(a);
    }

    static void arrchnage(int[] arr)
    {
        arr[0]=90;
        System.out.println(Arrays.toString(arr));
    }
}
