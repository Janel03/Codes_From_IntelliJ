package Class18Constructors;
public class HW1New {
    /*
    Write a Student class   that have instance variables name and address.
     Create a constructor that will initialize those variables.
     Print name & address of given  student using displayInfo method.
    */
    String name;
    String address;
    void displayInfo() {
        System.out.println("Student's name is: " + name +
                " ,Student's address is " + address);
    }
    HW1New(String name, String address){
        this.name=name;
        this.address=address;
    }
    public static void main(String[] args) {
        HW1New student=new HW1New("Janel", "1234 Street, USA");
        student.displayInfo();
    }}
