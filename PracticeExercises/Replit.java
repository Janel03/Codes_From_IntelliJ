package PracticeExercises;

import java.util.Scanner;

public class Replit {

	public static void main(String[] args) {
		
		Scanner Scanner=new Scanner(System.in);
        
        System.out.println("What is the teperature?");
        int temp=Scanner.nextInt();
        
        String country=null;
        
        switch (temp) {
        case 30:
        	country="Bora Bora";
        	break;
        	
        case 0:
        	country="Antarctica";
        	break;
        	
        case 100:
        	country="Turkey";
        	break;
        	
        default:
        	country="Germany";
        	break;
        }
        System.out.println("You should visit "+country);
        
      

    
    
	}

}
		
		
	


