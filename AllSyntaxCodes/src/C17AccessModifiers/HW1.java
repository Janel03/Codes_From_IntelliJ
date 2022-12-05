package C17AccessModifiers;

public class HW1 {
    /*
   Create a method that will accept an array as parameters and will return a sum of all elements from that array.
   Method should be visibly only within same package and accessible by the creating an instance of the class.
    */
    int sumNum(int[]array){
        int sum=0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
    public static void main(String[] args) {
        HW1 count=new HW1();
        System.out.println(count.sumNum(new int[]{8,9,7,0,2}));
    }}


