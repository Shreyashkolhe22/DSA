package linearSearch;

public class ReachestWealth {
    public static void main(String[] args) {

        int[][] accounts={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int result=maximumWealth(accounts);
        System.out.println(result);
    }
    static int maximumWealth(int[][] accounts)
    {
        int max=0;
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum+=accounts[i][j];
            }
            if(sum>max)
            {
                max=sum;
            }
        }return max;
    }
}

