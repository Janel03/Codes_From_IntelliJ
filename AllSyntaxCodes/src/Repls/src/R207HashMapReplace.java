import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class R207HashMapReplace {
    public static void main(String[] args) {
        HashMap<String,String> names=new HashMap<>();
        names.put("ONE","AAA");
        names.put("TWO","BBB");
        names.put("THREE","CCC");
        names.put("FOUR","DDD");
        names.put("FIVE","EEE");

        System.out.println("HashMap Before Replace :");
        Iterator<Map.Entry<String,String>> iterator=names.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> it=iterator.next();
            System.out.println(it.getKey()+" : "+it.getValue());
        }
        System.out.println("------------------");
        names.replace("THREE",  "ASEL");
        names.replace("FIVE", "SUMAIR");
        System.out.println("HashMap After Replace :");
        names.forEach((K,V)-> System.out.println(K+" : "+V));
    }}
