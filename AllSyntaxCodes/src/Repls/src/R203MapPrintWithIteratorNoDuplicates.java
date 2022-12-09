import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class R203MapPrintWithIteratorNoDuplicates {
    public static void main(String[] args) {
        HashMap<String,Integer> data=new HashMap<>();
        data.put("mango", 10);
        data.put("apple", 30);
        data.put("orange", 20);
        data.put("mango", 40);
        data.put("mango", 40);


        Set<String> allKeys=data.keySet();
        Collection<Integer> allValues=data.values();
        //System.out.println(allKeys+" "+allValues);
        var iterator=allKeys.iterator();
        var it = allValues.iterator();
        while(iterator.hasNext()){
            while ((it.hasNext())){
                var key=iterator.next();
                var value=it.next();
                System.out.println("Key is "+key+" and values is "+value);
            }}}}


