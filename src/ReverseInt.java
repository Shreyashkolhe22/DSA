public class ReverseInt {
    public static void main(String[] args) {
        int num=433547;
        int a=0;

        while (num>0){
            int rem=num%10;
            a=a*10+rem;
            num=num/10;

        }
        System.out.println(a);
    }
}
