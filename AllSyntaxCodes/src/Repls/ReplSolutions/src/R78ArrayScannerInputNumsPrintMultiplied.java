import java.util.Scanner;

public class R78ArrayScannerInputNumsPrintMultiplied {
    public static void main(String[]args){
    /*
    Create an int array of integers with a size of 5 and input values with Scanner.
    Don't print prompt questions for a user.
    Using loop print out each element of the array that should look like the output below
    Example:
    Input:
    1
    2
    3
    4
    5
    Output:
    10
    20
    30
    40
    50
     */
            int []array=new int[5];

            Scanner scan=new Scanner(System.in);

            for(int i=0;i<array.length;i++){
                array[i]=scan.nextInt();
            }
        for (int j : array) {

            System.out.println(j + "0");
        }
    }}


