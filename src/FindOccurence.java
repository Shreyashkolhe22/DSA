public class FindOccurence {
    public static void main(String[] args) {
        int num=1237347879;
        int count=0;
        while (num>0)
        {
            int rem=num%10;
            if(rem==7)
            {
                count=count+1;
            }
            num=num/10;
        }
        System.out.println(count);

        String str=String.valueOf(num);

        for(int i=0;i < str.length();i++)
        {
            if(str.charAt(i)=='7')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
