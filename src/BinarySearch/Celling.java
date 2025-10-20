package BinarySearch;

public class Celling {
    public static void main(String[] args) {
        int[] arr={4,6,10,15,22,30};
        int target=18;
        int result=findCelling(arr,target);
        System.out.println(result);

    }

    static int findCelling(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;

        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(target>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }return start;

    }
}
