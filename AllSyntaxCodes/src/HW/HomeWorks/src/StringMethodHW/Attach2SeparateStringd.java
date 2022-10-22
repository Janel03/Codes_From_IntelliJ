package StringMethodHW;

public class Attach2SeparateStringd {
    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable?
        String a="chop";
        String b="nom";

        a=a+b;
        b=a.substring(0,a.length()-b.length());

        System.out.println(b); //sout(a) prints: chopnom, (b) >chop
        System.out.println(a);
        /*
        String str1 = "chop";
        String str2 = "non";
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        str1 = str1+str2;  // LifeBeautiful
        System.out.println("-->After Swap<--");

        str2=str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());



        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

         */
    }
}
