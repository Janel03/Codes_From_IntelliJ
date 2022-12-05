package C22MethodOverriding;

public class Task1 {
    /* Homework
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some methods in child classes
    Define some methods specific to child classes.
    Write example of achieving run time polymorphism.
     */
}
class Student{
    void study(){
        System.out.println("students must study");
    }
    void doHomeWork(){
        System.out.println("students must solve their HWs");
    }
    void doPractice(){
        System.out.println("students must practice to get good marks");
    }}
class SyntaxStudent1 extends Student{
    @Override
    void doHomeWork(){
        System.out.println("students cry while solving Repls");
    }
    void doPractice(){
        System.out.println("syntax students must do their own research & practice");
    }}
class schoolStudent extends Student{

}