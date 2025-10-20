import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr=new int[5];
        arr[0]=2;
        arr[1]=7;
        arr[2]=5;
        arr[3]=3;

        System.out.println(Arrays.toString(arr));

        //input a elements in a array
        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[9];
        System.out.print("Enter a 9 elements for insert in array:- ");
        for(int i=0;i<9;i++)
        {
            arr1[i]=sc.nextInt();
        }
        //output of single array
        System.out.println(Arrays.toString(arr1));

        //input for making a multidimenstionl array
        int[][] multiarray=new int[3][3];
        System.out.print("Enter a 9 elements to insert in a 2D array:- ");
        for(int row=0; row<multiarray.length;row++)
        {
            for(int col=0;col<3;col++)
            {
                multiarray[row][col]=sc.nextInt();
            }
        }

        //output of 2D array
        for(int i=0;i<3;i++)
        {
            System.out.println(Arrays.toString(multiarray[i]));
        }


        //empty 2d array
        int[][] arrayEmpty=new int[3][3];
        for(int i=0;i<3;i++)
        {
            System.out.println(Arrays.toString(arrayEmpty));
        }

        //Array of String
        String[] arrayString={"akash","john","raj","rohit","virat"};
        System.out.println(Arrays.toString(arrayString));
    }
}
