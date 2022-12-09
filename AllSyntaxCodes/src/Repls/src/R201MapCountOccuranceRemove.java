import java.util.HashMap;

public class R201MapCountOccuranceRemove {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();
        data.put("Street", "Patrick ST");
        data.put("Suite", "265");
        data.put("City", "Vienna");
        data.put("Zip", "22180");
        data.put("Country", "United State");

        System.out.println(data.size());

        data.clear();
        System.out.println(data.size());
    }}