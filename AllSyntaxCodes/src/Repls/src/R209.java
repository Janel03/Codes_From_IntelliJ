import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class R209 {
    public static void main(String[] args) {
        List<Map<String, Object>> dataList = new ArrayList<>();

        Map<String, Object> appleMap = new HashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10.0);
        dataList.add(appleMap);
        Map<String, Object> OrangeMap = new HashMap<>();
        OrangeMap.put("Items", "Orange");
        OrangeMap.put("Price", 21.99);
        OrangeMap.put("Quantity", 10.0);
        dataList.add(OrangeMap);

        double subtotal = 0;
        double sum = 0;

        for (Map<String, Object> eachMap : dataList) {
            Object price = eachMap.get("Price");
            double eachPrice = (double) price;

            Object quantity = eachMap.get("Quantity");
            double eachQuantity = (double) quantity;

            Object items = eachMap.get("Items");
            String item = (String) items;

            subtotal = eachPrice * eachQuantity;
            sum += subtotal;

            System.out.println("Items: " + item + " Price: " + eachPrice + " Quantity: " + eachQuantity + " SubTotal: " + subtotal);
            System.out.println();
        }
        System.out.println("Your Purchase total : " + sum);
    }}