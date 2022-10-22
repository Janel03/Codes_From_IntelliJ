public class R120 {
   public static int year;
   static String schoolName;
   private int batchNumber;
   public void setYear(int i){
       year=i;}
   public void setName(String name){
        schoolName=name;}
    public void setBatch(int batch){
       batchNumber=batch;}

    public static void main(String[] args) {
        R120 printThis=new R120();
        printThis.setBatch(9);
        printThis.setName("Syntax");
        printThis.setYear(2021);
        System.out.println("I am a student of batch "+ printThis.batchNumber+" studying at "
                +printThis.schoolName+" in the year of "+printThis.year);
    }}

