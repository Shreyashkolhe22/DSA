import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(9);

        System.out.println(list);
        System.out.println(list.toArray().length);



        ArrayList<Integer> list1=new ArrayList<>();
//        input In arraylist
        for(int i=0;i<5;i++)
        {
            list1.add(sc.nextInt());
        }

        //output for arraylist
        for(int i=0;i<list1.toArray().length;i++)
        {
            System.out.println(list1.get(i));
        }
    }
}
