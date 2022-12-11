package C2.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String = non primitive, a value represented in "", start with upper case
		
	
		String name="Janel";
		
		String address="123 address street";
		
		int phone=1234567890; //if you add space add "" and change to string
		String phone1="123 456 7890";
		//String age="17"; //anything you put "" becomes a String
		int age=17; //age is in int
		String character="A";
		
		// syso + ctrl+space > completes the statement
		
		System.out.println(); 
		
		//My name is Janel
		//''Name name is" Janel //attach 2 strings together, to concatenate, add +
		System.out.println("My name is "+name); //add space after is, space matter inside ""
		
		//Asma is 17
		System.out.println(name + "is" +age);
		System.out.println(name + " is " +age); //add space inside ""
		
		String fruit="apple";
		double price=1.99;
		
		// The price of apple is 1.99
		
		System.out.println("The price of the "+fruit+" is "+price);
		/*to attach any value (int, double, boolean...) to a String use +
		 * + next to Sting acts as Concatenation
		 */
		fruit="mango";
		price=5.99;
		System.out.println("The price of the "+fruit+" is "+price);
		
		
	}

}

