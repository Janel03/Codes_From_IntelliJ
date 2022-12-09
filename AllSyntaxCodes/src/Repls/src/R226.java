public class R226 {
    public static void main(String[] args) {
        System.out.println(reverse("I am a java Programmer"));
    }
    public static String reverse(String strToRev){
        String reverse="";
        String[] singleWord = strToRev.split(" ");
        int length = singleWord.length;
        for(int i=length-1;i>=0;i--){
            String word = singleWord[i];
            reverse+=word+" ";
        }
        return reverse.trim() ;
    }}

   /*     String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        s=sc.nextLine();                    //reading string from user
        System.out.print("After reverse string is: ");
        for(int i=s.length();i>0;--i)                //i is the length of the string
        {
            System.out.print(s.charAt(i-1));            //printing the character at index i-1
        }
        return s;
    }
}
*/