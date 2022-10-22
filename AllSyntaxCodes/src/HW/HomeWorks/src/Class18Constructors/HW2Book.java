package Class18Constructors;

import java.util.Arrays;

public class HW2Book {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
    */
    String author;
    String title;
    String genre;
    double price;
    HW2Book(String author, String title){
        this.author=author;
        this.title=title;
        for (String s : Arrays.asList("My favorite book is written by " + author + " , named " + title + " " +
                        ",chronicling his experiences as a prisoner in Nazi concentration camps during World War II.",
                "It has won many nominations & included in the Must Read List by the Library of Congress.")) {
            System.out.println(s);
        }}
    HW2Book(String genre, double price){
        this.genre=genre;
        this.price=price;
        System.out.println(" It's genre is  "+genre+" and it is available for $"+price);
    }
    public static void main(String[] args) {
        HW2Book book1=new HW2Book( "Viktor Frankl", "Man's Search for Meaning");
        HW2Book book2=new HW2Book("Psychology", 15.99);
    }}
