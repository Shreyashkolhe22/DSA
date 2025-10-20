import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num=sc.nextInt();
        int reverse=0;

        for(int i=1;i<=num;i++)
        {
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println("This is reverse version of entered number :- "+reverse);
    }
}
