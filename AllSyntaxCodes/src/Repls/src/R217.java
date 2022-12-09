import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class R217 {
    public static void main(String[] args ){
        var number=new ArrayList<Integer>();
        number.add(5);
        number.add(5);
        number.add(3);
        number.add(2);
        number.add(5);
        System.out.println(countDuplicates(number));
    }
    public static int countDuplicates(List<Integer> numbers){
        Iterator<Integer> iterator=numbers.iterator();
        Iterator<Integer> iterator1=numbers.iterator();
        int count=0;
        while (iterator.hasNext()) {
            var number = iterator.next();
            while (iterator1.hasNext()) {
                Integer number1 = iterator1.next();
                if (!number.equals(number1)) {
                    continue;
                }
                count++;
            }}
        return count;
    }}

