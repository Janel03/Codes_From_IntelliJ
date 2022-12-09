public class R225 {
    public static void main(String[] args) {

        System.out.println(reverseInteger(123)+"\n"+reverseInteger(12345)+"\n"
                +reverseInteger(1001)+"\n"+reverseInteger(789));
    }
    public  static int reverseInteger(int N) {
   /*     int reverse=0;
        while(N!=0){
            int reminder=N%10;
            reverse=reverse*10+reminder;
            N/=10;
        }
        return reverse;
    }
}*/
        int reversed = 0;

        for (; N != 0; N /= 10) {
            int digit = N % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }}

