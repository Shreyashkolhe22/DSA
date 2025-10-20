import java.util.Scanner;

public class loopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number that you have to print numbers from 1 to till that number you enterd:-");
        int number = input.nextInt();

        for (int i=1; i<=number;i++){
            System.out.println(i);
        }

        System.out.println("have to print number with the gap of 3 from 1 to 60");
        for(int j=1;j<=60;j+=3)
        {
            System.out.println(j);
        }

        //while loop
        int a=1;
        while(a<=5)
        {
            System.out.println(a);
            a+=1;
        }
    }
}
