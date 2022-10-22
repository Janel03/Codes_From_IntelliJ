public class ReverseWord {
    public static void main(String[] args) {

        String a = "Welcome to the java class";
        String[] arr = a.split(" ");// welcome,to,the,java,class
        System.out.println(a.length());//5 -- 0  to 4

        for (int k = 0; k < arr.length; k++) {//string[]arry
            for (int m = arr[k].length() - 1; m >= 0; m--) {//arr[00>=0 arr[0] m=4
                System.out.print(arr[k].charAt(m));//arr[0.charAt[6] -- welcome--output emoclew
            }                                   //arr[0].charAt[4]
            System.out.print(" ");
        }

    }
}    //      0     1   2      3   4
// array= {Welcome, to, the, java, class};---k
//          w e l c o m e
//           0 1 2 3 4 5 6 --> m

//  k[o] -- welcome
//    m[6]-- e
//    m[5] --m
//    m[4]-- o
//    m[3] --c



