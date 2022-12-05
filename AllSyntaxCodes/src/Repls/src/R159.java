public class R159 {
    public static void main(String[] args) {
        Calcul minus=new Calcul();
        minus.calculate(100,20,40);

        minus.calculate(100,30,20,20);

        minus.calculate(40,20);
    }}
class Calcul{
    void calculate(int a, int b, int c){
        System.out.println(a-b-c);
    }
    void calculate (int a, int b, int c, int d){
        System.out.println(a-b-c-d);
    }
    void calculate (int a, int b){
        System.out.println(a-b);
}}
