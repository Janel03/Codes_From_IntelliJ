import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class R202MapPrintInOrderKeysNvaluesSeparately {
    public static void main(String[] args) {
        LinkedHashMap<String,String> data=new LinkedHashMap<>();
        data.put("1 item", "apple");
        data.put("2 item", "banana");
        data.put("3 item", "pear");
        data.put("4 item", "tomato");
        data.put("5 item", "mango");
        data.put("6 item", "kiwi");

        Set<String> allKeys=data.keySet();
        Collection<String> allValues=data.values();
        //System.out.println(allKeys+" "+allValues);
        var iterator=allKeys.iterator();
        var it = allValues.iterator();
        while(iterator.hasNext()){
            while ((it.hasNext())){
                var key=iterator.next();
                var value=it.next();
                System.out.println("Key is "+key+" and values is "+value);
            }}}}
