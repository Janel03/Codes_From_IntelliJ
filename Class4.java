import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter your name");
		//activates JAVA to take input from keyboard and store inside the name variable
		
		String name=input.next();
		//prints whatever name user enters on the keyboard on console
		
		System.out.println("Hello "+name+ " don't be confused");

	}

}
