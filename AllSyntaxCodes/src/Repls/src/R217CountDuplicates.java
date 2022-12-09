import java.util.HashSet;
//JUST EXAMPLE
public class R217CountDuplicates {
        public static void main(String[] args) {
            int[] arr={12,12,13,45,78,7,7};
            int[] arr2={12,12,7,7,7,7,7};
            int[] arr3={12,120,13,45,78,17,57};
            int[] arr4={12,12,13,45,78,67,87};
            System.out.println(DistinctList(arr));
            System.out.println(DistinctList(arr2));
            System.out.println(DistinctList(arr3));
            System.out.println(DistinctList(arr4));
        }
        public static boolean DistinctList(int[] arr){
            HashSet<Integer> hashSet = new HashSet<>();
            for (int num : arr) {
                hashSet.add(num);
            }
            int originalSize = arr.length;
            System.out.println("original size " + originalSize);
            int afterRemovalOfDup = hashSet.size();
            System.out.println("after removing duplicates " + afterRemovalOfDup);

            if (originalSize == afterRemovalOfDup) {
                return true;
            } else {
                return false;
            }}}


      /*  //JUST EXAMPLE
        System.out.println(check("12,12,13,45,78,7,7")); //false
        System.out.println(check("12,12,7,7,7,7,7")); //true
        System.out.println(check("12,120,13,45,78,17,57")); //false
        System.out.println(check("12,12,13,45,78,67,87")); // true
    }
    public static boolean check(String str){
        char [] arr=str.toCharArray();
        int opening=0;
        int closing=0;
        for (char c:arr
        ) {
            if(c=='1'){
                opening++;
            }else if(c=='2') {
                closing++;
            }}
        System.out.println(opening);
        System.out.println(closing);

        if(opening==closing){
            return true;
        }else {
            return false;
        }
    }
}
*/