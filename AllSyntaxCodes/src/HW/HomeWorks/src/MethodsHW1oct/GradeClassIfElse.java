package MethodsHW1oct;

public class GradeClassIfElse {
    //Create  class Student that will have a method getGrade.
    // Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F
    void grade (int num){
        if (num>=90 && num<=100){
            System.out.println("Your grade is A");
        }else if (num>=80 && num<=89){
            System.out.println("Your grade is B");
        }else if (num>=70 && num<=79){
            System.out.println("Your grade is C");
        }else if (num>=60 && num<=69) {
            System.out.println("Your grade is C");
        }else {
            System.out.println("Grade not recognized");
        }}

        public static void main(String[] args) {
        GradeClassIfElse num=new GradeClassIfElse();
        num.grade(99);
    }}
