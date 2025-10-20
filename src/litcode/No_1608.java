package litcode;

public class No_1608 {
    public static void main(String[] args) {
        int[] arr={3,5};
        System.out.println(specialArray(arr));
    }
    static int specialArray(int[] arr) {
        for(int x=0;x<=arr.length;x++)
        {
            int count=0;
            for (int num:arr)
            {
                if(num>=x)
                {
                    count++;
                }
            }
            if (count==x)
            {
                return x;
            }
        }return -1;
    }

}
