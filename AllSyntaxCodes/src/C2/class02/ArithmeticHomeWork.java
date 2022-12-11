package C2.class02;

public class ArithmeticHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Write a Java program to add, substract, multiply & divide 2 decimal values.");
		// Your program should say: "The __ of 2 numbers __ and is equal to ___"
		System.out.println("                                           ");
		
		double num1=8.7;
		double num2=6.4;
		
		double add=num1+num2;
		double sub=num1-num2;
		double mul=num1*num2;
		double div=num1/num2;
		
		System.out.println("The addition of 2 numbers "+num1 + " and " +num2 + " is equal to " +add);
		System.out.println("The subtraction of 2 numbers "+num1 + " and " +num2 + " is equal to " +sub);
		System.out.println("The multiplication of 2 numbers "+num1 + " and " +num2 + " is equal to "+mul);
		System.out.println("The division of 2 numbers "+num1 + " and " +num2+" is equal to "+div);
		
		System.out.println("--------------------------------------------------------------------------------");
		// Find square of the number 3.9. Your program should say "The square of the is __"
		
		double a=3.9;
		double b=3.9*3.9;
		
		System.out.println("The square of the number is " + a +" is " +b);
		
		System.out.println("---------------------------------------------------------------------------------");
		/* Print the area and perimeter of a rectangle with width = 5 and height = 8. Program should say: 
		 * "The perimeter of a rectangle with width and height __ is equal to __ and the area is __"
		 */
		int width=5;
		int height=8;
		
		int peri=2*(width+height);
		int area=width*height;
		
		System.out.println("The perimeter of a rectangle with width "+width + " and height" + height + " is equal to " + peri +" and the the area is " +width * height);


	}

}
