package Class18Constructors;

public class HW1 {
    /*
    Write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    public HW1(){//without parameters () empty
        System.out.println("empty");
    }
    public HW1(String str){//with parameters
        System.out.println("str= "+str);
    }
}
