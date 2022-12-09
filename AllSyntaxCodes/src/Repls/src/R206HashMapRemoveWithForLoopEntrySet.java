import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class R206HashMapRemoveWithForLoopEntrySet {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();
        data.put("ONE", "AAA");
        data.put("TWO", "BBB");
        data.put("THREE", "CCC");
        data.put("FOUR", "DDD");
        data.put("FIVE", "EEE");

        Set<Map.Entry<String, String>> info = data.entrySet();
        System.out.println("HashMap Before Remove :");
        for(Map.Entry<String,String>print:info){
            System.out.println(print.getKey()+" : "+print.getValue());
        }
        data.remove("ONE");
        data.remove("FOUR");
        Set<Map.Entry<String, String>> infos = data.entrySet();
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");
        for(Map.Entry<String,String>print:infos){
            System.out.println(print.getKey()+" : "+print.getValue());
        }

    }
}


