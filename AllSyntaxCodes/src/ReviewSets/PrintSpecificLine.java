package ReviewSets;

import ReviewLists.Student;

import java.util.*;

public class PrintSpecificLine {
    public static void main(String[] args) {
        /*if we don't override equals method in our custom classes most of the collections
        framework will not work properly with those classes*/
        //Set<Student> students=new HashSet<>();
        List<Student> students=new LinkedList<>();

        students.add(new Student("Janel","Sai","123"));
        students.add(new Student("Zorah","Sai","352"));
        students.add(new Student("Rimma","R","321"));
        students.add(new Student("Puskar","P","421"));

        System.out.println(students);//will print 1 st because of equals override method
        //sets don't have get method
        //do this to print a specific line
        List<Student> setStudents=new ArrayList<>(students);
        System.out.println(setStudents.get(1));
        //won't print Zorah, cause HashSet doesn't follow order
        //will print Zorah with LinkedList


    }
}
