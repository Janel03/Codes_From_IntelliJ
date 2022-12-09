import java.util.*;
public class R218 {
    public static void main(String[] args) {
        List<String>name=new LinkedList<>();
        name.add("switch");
        name.add("tv");
        name.add("switch");
        name.add("tv");
        name.add("switch");
        name.add("tv");
        name.add("radio");
        name.add("switch");

        List<String> listWord = countDeviceNames(name);
        System.out.println(listWord);
    }
    public static ArrayList<String> countDeviceNames(List<String> deviceNames) {
        Map<String,Integer> myMap=new LinkedHashMap<>();

        for(String s:deviceNames) {
            if (myMap.get(s) != null) {
                int count = myMap.get(s);
                String s1 = s.concat(String.valueOf(count));
                if (myMap.get(s1) != null) {
                    while (true) {
                        s1 = s.concat(String.valueOf(count));
                        if (myMap.get(s1) == null) {
                            break;
                        }
                        count++;
                    }
                    myMap.put(s1, count);
                } else myMap.put(s1, count++);
            } else myMap.put(s, 1);
        }
        var result=new ArrayList<String>();
        result.addAll(myMap.keySet());
        return result;
    }}
