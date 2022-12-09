package C28MapsAndexcel;
import java.util.HashMap;
//Demo 5 Get Keys & Values
public class PrintKeysnValues {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);
        //to get Keys & Values
        //Set<Map.Entry<String,Double>> entrySet=items.entrySet();1st way
        //2nd shorter way with []
        var entrySet=items.entrySet();
        System.out.println(entrySet);
        /*   var dog=new Dog(); // doesn't work with instance variables
        var number=10.2;*/
        // var lastname; does not work with instance variables as java can't figure out
        // the data type as there are no values

        //loop to print without []
        for (var item:entrySet){
            System.out.println(item);//PRINT VALUES & KEYS
            System.out.println("PRINT KEYS ONLY: "+item.getKey());
            System.out.println("PRINT VALUES ONLY: "+item.getValue());
            System.out.println("PRINT KEYS & VALUES TOGETHER: "+item.getKey() +" "+item.getValue());
        }}}