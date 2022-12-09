package C27CollectionsFramewors;
import java.util.HashMap;
//Map is an interface where all the methods are defined
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String> data=new HashMap<>();
        //this is how we store info inside a map
        data.put("UserName","Anton123");
        data.put("Passowrd","pass123");

        System.out.println(data);
        //this is how we can get back the values
        System.out.println("Password");
    }}
