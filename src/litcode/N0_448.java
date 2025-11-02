package litcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N0_448 {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {

        int i=0;
        while(i<nums.length)
        {
            int corretindex=nums[i]-1;
            if(nums[i] != nums[corretindex])
            {
                int temp=nums[corretindex];
                nums[corretindex]=nums[i];
                nums[i]=temp;
            }
            else {
                i++;
            }
        }

        ArrayList<Integer> list=new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {

            if(nums[j] != j+1)
            {
                list.add(j+1);
            }
        }return list;

    }
}
