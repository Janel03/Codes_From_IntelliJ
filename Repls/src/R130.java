public class R130 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);
        // should print out 10 1 30 2 50
    }
    static void mystery(int[] array)	{
        for (int j : array) {
            if (j % 2 == 0) System.out.print(j / 2);
            else System.out.print(j * 10);
            System.out.print(" ");
        }}}

