public class Main {
    public static void main(String[] args) {
        String name1 = "Hello world";
        char[] array = name1.toCharArray();
        String reverse = "";
        for(int i=array.length-1; i>=0; i--){
            reverse+=array[i];

        }
        System.out.println(reverse);
    }
}