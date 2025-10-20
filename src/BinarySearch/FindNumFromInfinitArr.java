package BinarySearch;

public class FindNumFromInfinitArr {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(range(arr,target) );
    }

    static int range(int[] arr, int target)
    {
        int start=0;
        int end=1;
        while(arr[end]<target)
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return search(arr,target,start,end);

    }

    static int search(int[]arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(arr[mid]<target)
                start=mid+1;
            else
                end=mid-1;
        }return -1;
    }
}
