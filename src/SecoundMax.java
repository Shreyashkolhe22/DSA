public class SecoundMax {
    public static void main(String[] args) {
        int[] arr={20,2,21,8,17,14,4};
        System.out.println(secmax(arr));
    }

    static int secmax(int[] arr)
    {
        int first=arr[0];
        int secound=arr[0];

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>first)
            {
                secound=first;
                first=arr[i];
            } else if (arr[i]>secound && arr[i]<first) {
                secound=arr[i];
            }
        }return secound;
    }
}
