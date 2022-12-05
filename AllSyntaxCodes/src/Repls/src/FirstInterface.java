
interface FirstInterface {
        void firstMethod();
    }
    interface SecondInterface extends FirstInterface{
        void secondMethod();
    }
   /* class Main implenets SecondInterface {
        public static void main(String[] args) {
            Main print=new Main();
            print.firstMethod();
            print.secondMethod();
        }
        public void firstMethod(){
            System.out.println("First Method implementing multiple Inheritance");
        }
        public void secondMethod(){
            System.out.println("Second Method implementing multiple Inheritance");
        }}






    /*
    public class Main extends SecondInterface{
        public static void main(String[] args) {
            Main print=new Main();
        }
        public void firstMethod(){
            System.out.println("first method");
        }
        public void secondMethod(){
            System.out.println("second method");
        }
    }
    /*
    void firstMethod();
    void SecondInterface();
}
class Repl175 implements R175{

    @Override
    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");
    }

    @Override
    public void SecondInterface() {
        System.out.println("Second Method implementing multiple Inheritance");
    }}
interface R175Tester {
    static void main(String[] args) {
        R175 obj=new Repl175();
        obj.firstMethod();
        obj.SecondInterface();
*/



