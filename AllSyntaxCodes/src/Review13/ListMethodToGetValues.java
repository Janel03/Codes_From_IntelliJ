package Review13;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMethodToGetValues {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);

        List<Double> values=getValues(items);
        System.out.println(values);

    }//method that takes a map & returns an arrayList containing all the keys from that map
    public static List<Double> getValues(Map<String, Double> mapValue) {
    return new ArrayList<>(mapValue.values());
    }
}


