package litcode;

public class FindEleRollingArr {
    public static void main(String[] args) {

    }

    static int search(int[] nums, int target) {
        int peak=findPeak(nums);
        if(peak != -1 && target == nums[peak]) {
            return peak;
        }
        if(peak==-1)
        {
            return binarysearch(nums,target,0,nums.length-1);
        }
        if(target >= nums[0]) {
            return binarysearch(nums, target, 0, peak);
        } else {
            return binarysearch(nums, target, peak + 1, nums.length - 1);
        }

    }

    static int binarysearch(int[] arr,int target,int start,int end)
    {
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
    static int findPeak(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]) return mid;
            if(mid > start && arr[mid] < arr[mid - 1]) return mid-1;

            if(arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }return -1;
    }
}
