package linearSearch;

public class MinInArr {
    public static void main(String[] args) {
        int[] arr={55,66,45,89,75,35};
        min(arr);
    }

    static void min(int[] arr)
    {
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
