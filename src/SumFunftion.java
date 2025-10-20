import java.util.Scanner;

public class SumFunftion {
    Scanner sc=new Scanner(System.in);
    public void add()
    {
        System.out.print("Enter a First number :- ");
        int num1=sc.nextInt();
        System.out.print("Enter a secound number :- ");
        int num2=sc.nextInt();
        int sum=num2+num1;
        System.out.println("Sum :- "+sum);
    }
    static void greet()
    {
        System.out.println("Welcome user");
    }

    public static void main(String[] args) {
        SumFunftion obj=new SumFunftion();
        greet();
        obj.add();

    }
}
