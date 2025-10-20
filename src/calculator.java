import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true)
        {
            System.out.print("enter a opration like +,-,*,/,% :- ");
            char ch=sc.next().trim().charAt(0);
            if(ch == '+' ||ch== '-' || ch== '*' || ch== '/' || ch== '%')
            {
                System.out.print("Enter a first number: ");
                int num1=sc.nextInt();
                System.out.print("Enter a second number: ");
                int num2=sc.nextInt();

                if(ch=='+')
                {
                    System.out.println(num1+num2);
                }
                else if(ch=='-')
                {
                    System.out.println(num1-num2);
                } else if (ch=='*') {
                    System.out.println(num1*num2);
                }
                else if (ch=='/') {
                    if (num2>0)
                        System.out.println(num1/num2);
                }
                else {
                    System.out.println(num1%num2);
                }
            } else if (ch=='x' || ch=='X')
            {
                break;
            }
            else{
                System.out.println("invalid opration ");
            }
        }
    }
}
