import java.util.ArrayList;
import java.util.TreeSet;

public class R198SetPrintInOrderNremoveDuplicate {
    public static void main(String[] args) {

       var words=new ArrayList<String>();
        words.add("India");
        words.add("Australia");
        words.add("South Africa");
        words.add("India");
        words.add("America");
        words.add("America");

        System.out.println(removeDuplicates(words));
    }
    public static ArrayList<String> removeDuplicates(ArrayList<String> arrayList){
        TreeSet<String> hashSet=new TreeSet<>(arrayList);
        return new ArrayList<>(hashSet);
    }
}
