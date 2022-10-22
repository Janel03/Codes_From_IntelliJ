package Cl17Strings;

public class HW6 {
    /*
    Write a java class that has 4 constructors with 4 different access levels of constructors(private,public,default,protected)
     and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
     3 - from different class inside different package  and observe result.
    */
    private String fname;
    private String lname;
    private int age;
    private double height;
    private double weight;
    private boolean isEducated;

    private HW6(String pfname, String plname) {
        fname = pfname;
        lname = plname;
    }
    public HW6(int page) {
        age = page;
    }
    HW6(double pheight, double pweight, boolean pisEducated) {
        height = pheight;
        weight = pweight;
        isEducated = pisEducated;
    }
    protected HW6() {
    }
    private void info(){
    System.out.println(fname+" "+lname);
}
void printInfo(){
        if(isEducated)
    System.out.println("Height "+height+", weight "+weight);
}
public String ageInfo(){
        if (age<=19 && age>=13){
            return "you are a teenager";
        }else {
            return "you're not s teenager";
        }}
    public static void main(String[] args) {
        HW6 person = new HW6("joe", "biden");
    }}
