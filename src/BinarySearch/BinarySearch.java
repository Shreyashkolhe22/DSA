package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,12,34,56,65,68,76,89,93};
        int target=89;
        int result=search(arr,target);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }


    }
    static int search(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            if(target<arr[mid])
            {
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }return -1;
    }
}
