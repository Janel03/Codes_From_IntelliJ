package PrivateClass;

import java.util.Arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] names={"adam","jon","don","karl"};
//first specify var String, then give a name to store, then call the var names
        for (String name:names){ //enhanced for loop can't update, 1 con
            System.out.println(name);
        }
        for (int i = 0; i < names.length; i++) {//only normal for loop can update the name
            if (names[i].equals("john")){
                names[i]="john";
            }
        }
        names[1]="john";//this is how you update the array

        System.out.println(Arrays.toString(names));
    }
}
