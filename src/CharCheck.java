import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=input.next().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("the character is lower");
        }
        else {
            System.out.println("the character is a upper case character");
        }
    }
}
