import static java.util.Arrays.stream;

public class R141 {
    public static void main(String[] args) {
        int[] arr = {5, 12, -3, 7, 3, 22};
        System.out.println(maxValue(arr)); //should print 22
    }
    public static int maxValue(int[] arr) {
        return stream(arr).max().getAsInt();
    }}
/*
 private static int maxValue(int[] arr) {
        return stream(arr).max().getAsInt();
    }}
*/








