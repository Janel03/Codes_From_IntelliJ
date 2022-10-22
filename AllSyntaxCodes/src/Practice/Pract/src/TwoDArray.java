public class TwoDArray {
    public static void main(String[] args) {
        int[][] numbers = {
                {2, 5, 4, 35, 54},
                {34, 645, 76, 87},
                {43, 65, 87, 43}
        };
        int max=0;
        for (int[] number : numbers) {
            max = 0;
            for (int i : number) {
                if (i > max) {
                    max = i;
                }}
            System.out.println(max);
        }}}
/*
 int max=0;
        for(int i=0;i<numbers.length;i++){
            max=0;
            for(int j=0;j<numbers[i].length;j++){
                if(numbers[i][j]>max){
                    max=numbers[i][j];
 */



