import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to Check its prime on not :- ");
        int num = sc.nextInt();
        boolean ans=isprime(num);
        System.out.println(ans);
    }

    static boolean isprime(int num)
    {
        for(int i=2;i*i<num;i++)
        {
            if(num<1)
                return false;
            else if(num/i==0)
                return false;
            else
                return true;
        }
        return false;
    }
}

