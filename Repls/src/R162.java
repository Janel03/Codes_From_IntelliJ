public class R162 {

    static void m1()
    {
        System.out.println("static method without parameter");
    }

    static void m1(int num)
    {
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args)
    {
        m1();
        m1(5);
    }
}
