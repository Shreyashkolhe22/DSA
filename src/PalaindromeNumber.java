public class PalaindromeNumber {
    public static void main(String[] args) {
        int num=-151;
        System.out.println(CheckisPalanidrome(num));

    }
    static boolean CheckisPalanidrome(int number)
    {
        if(number<0)
        {
            return false;
        }
        //Tacking a copy of number to find a reverse number
        int temp=number;
        //This store the reverse number of a given number
        int reverse=0;
        while (temp!=0)
        {
            reverse=reverse*10+temp%10;
            temp=temp/10;
        }
        return number==reverse;
    }
}
