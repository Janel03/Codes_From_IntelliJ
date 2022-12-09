public class R210 {
    public static void main(String[] args) {
        int a=10, b=0, result;
        try {
            result = a / b;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
