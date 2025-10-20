import java.util.Scanner;

public class febonanci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print the febo series till that nth number:- ");
        int n=sc.nextInt();

        int prv=0;
        int curr=1;

        for(int i=1;i<=n;i++){
            System.out.print(prv+" ");
            int next=prv+curr;
            prv=curr;
            curr=next;

        }
    }
}
