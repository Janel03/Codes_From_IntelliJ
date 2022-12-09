import java.util.ArrayList;

public class R196Remove {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("third");
        words.add("first");
        words.add("second");
        System.out.println(words);

        words.removeAll(words);
        System.out.println(words);
    }}
