package C27CollectionsFramewors;
import java.util.HashMap;
public class SearchReturnReplacePrintOneItemOnly {
    public static void main(String[] args) {

        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

        System.out.println(fruit);//print all Keys & Values
        System.out.println(fruit.get("Orange"));//to print only the value of Orange
        fruit.remove("Mango");//to remove
        System.out.println(fruit);

        System.out.println(fruit.containsKey("Apple"));//to search for a specific item
        System.out.println(fruit.containsKey("Kiwi"));//will return false
        System.out.println(fruit.containsValue(4.99));//searches for the value/price
        System.out.println(fruit.isEmpty());
        //replace the value
        fruit.replace("Apple",2.99);
        System.out.println(fruit);
    }}
