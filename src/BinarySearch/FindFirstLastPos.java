package BinarySearch;

import java.util.Arrays;

public class FindFirstLastPos {
    public static void main(String[] args) {
        int[] arr={2,3,7,7,7,8,9};
        int target=7;
        int[] rel=searchRange(arr,target);
        System.out.println(Arrays.toString(rel));

    }
    static int[] searchRange(int[] nums, int target)
    {
        boolean isFirst=true;
        int res1=cal(nums,target,true);
        int res2=cal(nums,target,false);
        int[] ans={res1,res2};
        return ans;
    }

    static int cal(int[] nums,int target,boolean isFirst)
    {
        int result=-1;
        int start=0;
        int end=nums.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>target)
                end=mid-1;
            else if (nums[mid]<target)
                start=mid+1;
            else {
                result = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }return result;
    }


}

