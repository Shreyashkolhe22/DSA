package litcode;

import java.util.Arrays;

public class N0_1480 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=0;j<=i;j++)
            {
                sum=sum+nums[j];
            }
            nums[i]=sum;
        }
        return nums;
    }
}

