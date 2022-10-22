import java.util.Arrays;
import java.util.Comparator;

public class R140 {
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
    private static String maxLength(String []arr){
        return Arrays.stream(arr)
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
    }}

