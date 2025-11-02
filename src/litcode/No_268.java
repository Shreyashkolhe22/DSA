package litcode;

import java.util.Arrays;

public class No_268 {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
        int i=0;
        while (i < nums.length)
        {
            if(nums[i] != i && nums[i] < nums.length)
            {
                int currentindex=nums[i];
                int temp=nums[currentindex];
                nums[currentindex]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }

        }

        for(int j=0; j< nums.length ;j++)
        {
            if(nums[j] != j)
            {
                return j;
            }

        }return nums.length;
    }
}
