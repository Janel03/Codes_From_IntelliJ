package C29FileHandling;
import C27CollectionsFramewors.Dog;
import Utils.ExcelReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
//accessing through this method, the Dog Object/class from another package
public class MethodsDemo {
    public static Dog returnDog(){
        return new Dog("Fluffy","green","German");
    }
    //can return anything from that class, for eg>returning map
    public static Map<String,String>getMap(){
        Map<String,String> map=new LinkedHashMap<>();
        map.put("Apple", "Mango");
        return map;
    }
    /*when we created properties object, we are returning it from the method*/
    public static void main(String[] args) throws IOException {
        Dog dog=returnDog();
        System.out.println(dog);
        //calling Map
        System.out.println(getMap());
        //calling Excel file
        var data=ExcelReader.read("C:\\Users\\ryan_\\IdeaProjects\\SDETBatch14Java\\AllSyntaxCodes\\Data\\ExcelTest.xlsx");
        //if I want to return data from row #1
        System.out.println(data.get(0));
        //to get a specific cell, for eg>Age
        LinkedHashMap<String,String> map=data.get(0);
        System.out.println(map.get("Age"));
    }}
