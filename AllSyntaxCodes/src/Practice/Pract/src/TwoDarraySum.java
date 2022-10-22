public class TwoDarraySum {
    public static void main(String[] args) {
        int[][] numbers = {
                {2, 5, 4, 35, 54},
                {34, 645, 76, 87},
                {43, 65, 87, 43}
        };
        int sum=0;
        int max=0;
        for (int[] number : numbers) {
            sum = 0;
            for (int i : number) {
                sum += i;
            }
            System.out.println(sum);
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println("The biggest number "+max);
    }}
/*
 for(int i=0;i<numbers.length;i++){
            sum=0;
            for(int j=0;j<numbers[i].length;j++){
                sum+=numbers[i][j];
            }
            System.out.println(sum);
            if(sum>max){
                max=sum;
            }}
 */


