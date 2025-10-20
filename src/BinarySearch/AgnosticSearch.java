package BinarySearch;

public class AgnosticSearch {
    public static void main(String[] args) {
        int[] arr={80,50,46,36,24,15,8,2};
        boolean isAssecnding=arr[0]<arr[arr.length-1];
        int target=15;
        int result=search(arr,isAssecnding,target);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    static int search(int[] arr,boolean isAssecnding,int target)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAssecnding)
            {
                if(target<arr[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }
            else {
                if(target<arr[mid])
                    start=mid+1;
                else
                    end=mid-1;
            }
        }return -1;
    }
}
