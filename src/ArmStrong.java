import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        int count=0;
        boolean IsArmStrong;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number to check is Armstrong or Not :- ");
        int num=sc.nextInt();
        int original=num;

        int temp=num;
        while(temp!=0)
        {
             temp=temp/10;
             count+=1;
        }
        System.out.println(count);

        int as=0;

        for(int j=1;j<=count;j++)
        {
            int rem=original%10;
            as+= Math.pow(rem, count);
            original=original/10;
        }
        if(num==as)
        {
            System.out.println("The Number is ArmStrong Number");
        } 
        else
        {
            System.out.println("The Number is not ArmStrong Number");
        }
    }
}
