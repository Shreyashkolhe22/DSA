package linearSearch;

public class FindEvenDigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,789};
        int result=findNumbers(nums);
        System.out.println(result);
    }
    static int findNumbers(int[] nums) {
        int even=0;
        for(int i = 0; i < nums.length; i++) {
            int count=(int)(Math.log10(nums[i]))+1;
            if(count%2==0)
            {
                even+=1;
            }
        }return even;
    }
}
