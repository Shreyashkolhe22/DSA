import java.util.Scanner;

public class ArmStronFun {
    static  boolean isArmStrong(int num)
    {
        int original=num;
        int temp=num;
        int count=0;
        int sum=0;

        while (temp>0)
        {
            temp=temp/10;
            count++;
        }

        int temp2=original;
        for(int i=1;i<=count;i++)
        {
            int rem=temp2%10;
            sum +=Math.pow(rem, count);
            temp2=temp2/10;
        }

        if(original==sum)
        {
            return true;
        }
        else
            return false;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:-");
        int num=sc.nextInt();
        boolean ans=isArmStrong(num);
        System.out.println(ans);
        for (int i=1;i<1000;i++)
        {
            if(isArmStrong(i)==true)
            {
                System.out.println(i);
            }
        }
    }
}
