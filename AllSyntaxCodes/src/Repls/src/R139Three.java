public class R139Three {
    public static String alphabetical(String str) {
        StringBuilder String = new StringBuilder();
        int val;
        for (int i = 0; i < str.length() - 1; i++) {
            val=Math.max(str.charAt(i + 1), str.charAt(i));
            StringBuilder append = String.append((char) val);
            if (i >= str.length() - 3) continue;
            i++;
        }
        return String.toString();
    }
    public static void main(String[] args) {
        System.out.println(alphabetical("hello"));
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }
}

