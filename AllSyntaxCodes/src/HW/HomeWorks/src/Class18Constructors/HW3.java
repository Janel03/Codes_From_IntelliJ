package Class18Constructors;
/*Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this
    class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    and observe result.
     */
public class HW3 {
    private HW3(){
        System.out.println("private");
    }
    HW3(String name){
        System.out.println("default");
    }
    protected HW3(int age){
        System.out.println("protected");
    }
    public HW3(boolean isTrue){
        System.out.println("public");
    }
    public static void main(String[] args) {
        new HW3();
        new HW3("Thank you");
        new HW3(10);
        new HW3(true);
    }}
