import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class R208 {
    public static void main(String[] args) {

        Map<String,Integer> fruit=new HashMap<>();
        fruit.put("mango", 10);
        fruit.put("apple", 30);
        fruit.put("orange", 20);
        Display(fruit);
        fruit.clear();
        Display(fruit);
    }
    static void Display(Map<String,Integer> fruits){
        if(fruits.isEmpty()){
            System.out.println("map is empty");
        }else {
            Iterator<Map.Entry<String,Integer>> iterator=fruits.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String,Integer>it=iterator.next();
                System.out.println(it.getKey()+" : "+it.getValue());
            }}}}


