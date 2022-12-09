import java.util.Scanner;
import java.util.stream.IntStream;

public class R223 {
    public static void main(String[] args) { Scanner input=new Scanner(System.in);
        int num = input.nextInt();
        int i=1;
        while (i<=num) {
            for(int j=i;j<num;j++){
                System.out.print(" ");
            }
            IntStream.range(1, (i * 2)).mapToObj(k -> num + " ").forEachOrdered(System.out::print);
            System.out.println();
            i++;
        }
    }}