import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class R205HashMapPrintUpperCase {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();
        data.put("Street", "Patrick ST");
        data.put("Suite", "265");
        data.put("City", "Vienna");
        data.put("Zip", "22180");
        data.put("Country", "United State");

        Set<Map.Entry<String, String>> info = data.entrySet();
        for(Map.Entry<String,String>printUpper:info){
            System.out.println(printUpper.getValue().toUpperCase());
        }}}

