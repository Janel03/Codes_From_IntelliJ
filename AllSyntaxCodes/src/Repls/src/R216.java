import java.util.Arrays;
public class R216 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySumToZero(4)));
    }
    public static int[] arraySumToZero(int N) {
        var arr = new int[N];
        int i = 0;
        while (i < N - 1) {
            arr[i] = i + 1;
            arr[i + 1] = -(i + 1);
            i += 2;
        }
        return arr;
    }}

    /*static  Scanner scan = new Scanner (System.in);
    public static void main(String [] args){
        int n = scan.nextInt();
        printMethod(arraySumToZero(n));
    }
    public static int[] arraySumToZero(int N) {
        var arr = new int[N];
        var sum=0;
        Random r = new Random();

        var rand = r.nextInt(2 ^ (31 - 1));
        for(int i=0;i<N;i++){
            arr[i]=(i%2!=0)?rand:rand*(-1);
            sum+=arr[i];
            if (i == N - 1) {
                arr[i] = (N % 2 != 0) ? 0 : rand;
            }}
        return arr;
    }
    public static void printMethod(int []nums){
        for(int i:nums) System.out.print(i + " ");
    }}
*/

