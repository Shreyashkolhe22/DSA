package linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={12,55,66,45,89,75,35};
        int target=45;
        int reasult =search(arr,target);

        if(reasult==-1)
            System.out.println("Element not Found ..!");
        else
            System.out.println("Element Found At index :- "+reasult);
    }

    static int search(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
