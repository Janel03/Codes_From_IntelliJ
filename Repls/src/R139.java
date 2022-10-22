public class R139 {

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software")); //"stwr"
        System.out.println(alphabetical("language"));//"lnug"
    }
    public static String alphabetical(String str) {
        String nString = "";
        int value;
        for (int i = 0; i < str.length() - 1; i++) {
            value = Math.max((int) str.charAt(i), (int) str.charAt(i + 1));
            nString += (char) value;
            if (i < str.length() - 3)
                i++;
        }
        return nString;
    }}


