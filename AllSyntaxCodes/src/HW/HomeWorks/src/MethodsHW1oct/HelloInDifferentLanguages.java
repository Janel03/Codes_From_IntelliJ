package MethodsHW1oct;

public class HelloInDifferentLanguages {
    //Create a method that will say Hello in different language based on the country
    //that will passed when method is executed
    String hello(String country) {
        String sayHello;

        if (country.equalsIgnoreCase("Kazakhstan")) {
            sayHello = "СӘлем бердiк!";
        } else {
            if (country.equalsIgnoreCase("South Africa")) {
                sayHello = "Hoe gaan dit?";
            } else if (country.equalsIgnoreCase("Russia")) sayHello = "Здравствуйте!";
            else {
                sayHello = "I don't know how to greet in that language";
            }
        }
        return sayHello;
    }

    public static void main(String[] args) {
        HelloInDifferentLanguages print = new HelloInDifferentLanguages();
        System.out.println("Hello in "+("Kazakhstan")+" is = " + print.hello("Kazakhstan"));
    }
}