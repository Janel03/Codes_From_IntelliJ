public class R161 {
    public static void main(String[] tulip) {
        R1610 print=new R1610();
        print.m1("private m1 method ");
        print.m1("private m1 method", 0);
    }
}
class R1610{
    void m1(String a){
        System.out.println(a);
    }
    void m1(String a, int b){
        System.out.println(a+" with int parameter");
    }
}