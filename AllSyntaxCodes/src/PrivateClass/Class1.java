package PrivateClass;

public class Class1 {
    public static void main(String[] args) {
// if I finish this course with A, I will get a job for $130.000

        char grade = 'A';
        double salary = 130.00;

        if (grade == 'A' && salary == 130.000) {
            System.out.println("I got a good paying job!");
        } else {
            System.out.println("Learn to code more");
        }
        if (grade == 'A' && salary == 130.000) {
            System.out.println("I got a good paying job!");
        } else if (grade < 'A' && salary < 130.000) {
            System.out.println("Learn to code more");
        }
    }
}
