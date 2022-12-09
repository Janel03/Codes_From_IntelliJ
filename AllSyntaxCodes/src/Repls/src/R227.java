import java.util.Arrays;
import java.util.LinkedList;

public class R227 {
    public static void main(String[] args) {
        System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>")); System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }
    public static String HTMLElements(String str){
        var open = new LinkedList<String>();
        var openTags = Arrays.asList("b", "i", "em", "div", "p");
        var closeTags = Arrays.asList("/b", "/i", "/em", "/div", "/p");
        String[] splits = str.split("[><]");
        for (String split : splits) {
            if (openTags.contains(split)) {
                open.add(split);
            }
            if (closeTags.contains(split) && open.size() != 0) {
                if (open.getLast().equals(split.substring(1))) open.removeLast();
                else {
                    return open.getLast();
                }}}
        return "true";
    }}

