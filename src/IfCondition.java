import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary to check get your bonus:-");
        int salary = sc.nextInt();

        //if salary is bellow 20000 it get bonous 1000 and if it is greater the get a 2000 bonous

        if(salary>=20000)
            salary=salary+2000;
        else
            salary=salary+1000;

        System.out.println("your salary with bonus is :- "+salary);
    }
}