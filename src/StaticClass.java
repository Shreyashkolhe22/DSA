public class StaticClass {
    static class demo
    {
        static void show()
        {
            System.out.println("this is nested static class");
        }
    }

    public static void main(String[] args) {
        demo.show();
    }

}
