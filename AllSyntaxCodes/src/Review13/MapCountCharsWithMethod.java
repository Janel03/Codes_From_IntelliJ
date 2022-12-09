package Review13;
import java.util.HashMap;
import java.util.Map;
//create a method that returns a map of character & their count in a String
//Interview question
public class MapCountCharsWithMethod {
    public static void main(String[] args) {
        String str="I am a successful Automation Tester";
        System.out.println(getCount(str));
    }
    public static Map<Character,Integer> getCount(String str){
        char[] charArr=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (char c:charArr){
            if (map.get(c)==null){
                map.put(c,1);
            }else {
                int count=map.get(c);
                count=count+1;
                map.put(c,count);
            }}
        return map;
    }}
