public class R137 {
String name;
public String city;
private String nameOfSchool;
static int batchNum;
     R137(String name, String city, String nameOfSchool, int batchNum) {
        this.name=name;
        this.city=city;
        this.nameOfSchool=nameOfSchool;
        this.batchNum=batchNum;
    }
    void printInfo(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at"+nameOfSchool+" in batch "+batchNum);
}
    public static void main(String[] args) {
        R137 call=new R137( "Janel", "Waterford", "Syntax", 14);
        call.printInfo();
    }
}
