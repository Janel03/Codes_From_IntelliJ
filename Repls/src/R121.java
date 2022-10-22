public class R121 {
    int num;
    double num2;
    char abc;
    void display(){
        System.out.println(num);
        System.out.println(num2);
        System.out.println(abc);
    }
    public static void main(String[] args) {
        R121 print;
        print = new R121();
        print.num=10;
        print.num2=10.23;
        print.abc='a';
        print.display();

        R121 print2;
        print2 = new R121();
        print2.num=100;
        print2.num2=100.23;
        print2.abc='s';
        print2.display();

}
}