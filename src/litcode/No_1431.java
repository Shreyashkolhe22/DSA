package litcode;

import java.util.ArrayList;
import java.util.List;

public class No_1431 {
    public static void main(String[] args) {

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans=new ArrayList<>();
        int max=candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]>max)
                max=candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            int nums=candies[i]+extraCandies;
            if (nums<max)
            {
                ans.add(true);
            }
            else
                ans.add(false);
        }return ans;
    }
}
