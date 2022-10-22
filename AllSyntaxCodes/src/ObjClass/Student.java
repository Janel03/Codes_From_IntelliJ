package ObjClass;

public class Student {
    String name;
    String id;
    int age;
    double weight;
    char gender;

    void study() {
        System.out.println("Student is sleeping");
    }
    void deleteMessages() {
        System.out.println("Deleting messages from Discord");
    }
    void eat() {
        System.out.println("Eating Pizza");
    }

    public static void main(String[] args) {
//newStudent( = creates the object of Student Class
        Student janelObject=new Student();
        janelObject.name="Janel";
        janelObject.id="123";
        janelObject.age=22;
        System.out.println(janelObject.name);
        System.out.println(janelObject.id);
        System.out.println(janelObject.age);

        Student student2=new Student();
        student2.name="Asma";
        student2.age=16;
        student2.weight=30;
        System.out.println(student2.name);
        System.out.println(student2.weight);


    }

}


