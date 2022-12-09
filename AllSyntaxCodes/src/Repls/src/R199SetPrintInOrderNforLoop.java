import java.util.ArrayList;
import java.util.Iterator;

public class R199SetPrintInOrderNforLoop {
    public static void main(String[] args) {

        var words = new ArrayList<String>();
        words.add("null");
        words.add("Sohil");
        words.add("Diego");
        words.add("Alijon");
        words.add("Asel");
        words.add("Sumair");

        for (String element:words){
            System.out.println(element);
        }
        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String print=iterator.next();
            System.out.println(print);
        }
    }
}

