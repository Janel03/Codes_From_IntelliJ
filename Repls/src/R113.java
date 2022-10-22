public class R113 {
   static int hour=0;
   static int min=0;

   void printTime (int hour, int min){
       System.out.println(hour+":"+min);
   }

    public static void main(String[] args) {
        R113 callTime=new R113();
        callTime.printTime(11,30);
}
}
