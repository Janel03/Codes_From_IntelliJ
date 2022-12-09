import java.util.Collection;
import java.util.LinkedHashMap;

public class R200MapPreserveOrderPrintRemove {
    public static void main(String[] args) {
        LinkedHashMap<String,String> data=new LinkedHashMap<>();
        data.put("Street", "Patrick ST");
        data.put("Suite", "265");
        data.put("City", "Vienna");
        data.put("Zip", "22180");
        data.put("Country", "United State");

        Collection<String> info=data.values();
        var iterator=info.iterator();
        while(iterator.hasNext()){
            var word=iterator.next();
            System.out.println(word);

        }}}
