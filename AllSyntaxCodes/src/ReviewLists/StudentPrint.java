package ReviewLists;

import java.util.ArrayList;

public class StudentPrint {
    public static void main(String[] args) {
        ArrayList<Student> student=new ArrayList<>();
        student.add(new Student("Janel","Sai","123"));
        student.add(new Student("Ben","B","124"));
        student.add(new Student("Puskar","P","423"));

        System.out.println(student);

        //remove elements, how to access methods from a class
        for (Student student1 : student) {
            student1.printName();

        }
        //will print false, to get true do Override in line 29 in Student class
        Student janel=new Student("Janel","Sai","123");
        System.out.println(student.contains(janel));
        //will print the location of students
        System.out.println(student);
        System.out.println(janel);//prints the array of students

    }
}
