import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class R204PrintAllIterator {
    public static void main(String[] args) {
        Map<String, String> data = new LinkedHashMap<>();
       data.put("Street", "Patrick ST");
       data.put("Suite", "265");
       data.put("City", "Vienna");
       data.put("Zip", "22180");
       data.put("Country", "United State");

        Iterator<Map.Entry<String,String>>iterator = data.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String>entry=iterator.next();
            System.out.println(entry.getValue());
        }}}



