package StringMethodHW;

public class CountStringNums {
    public static void main(String[] args) {
//Create a String that should be combination of letters,numbers and special characters.
// Find out how many Alphanumeric (abd AZ 284) characters are there in the String.
        String sentence="I am studying J@V@ 2 become the best Tester/Programmer in 2023!";
        String az=sentence.replaceAll("[^a-z]","");
        int azCount=az.length();
        System.out.println("There are "+azCount+" lowercase letters in this sentence.");

        String AZ=sentence.replaceAll("[^A-Z]","");
        int AZCount=AZ.length();
        System.out.println("There are "+AZCount+" uppercase letters in this sentence.");

        String num=sentence.replaceAll("[^0-9]","");
        int numCount=num.length();
        System.out.println("There are "+numCount+" numbers in this sentence.");

        String specialChar=sentence.replaceAll("[^A-Za-z0-9]","");
        int specialChars=specialChar.length();
        System.out.println("There are "+numCount+" special characters in this sentence.");

        String sentence2=sentence.replaceAll("[^A-za-z0-9]","");
        int sentence2Count=sentence2.length();
        System.out.println("There are "+sentence2Count+" Alphanumeric in this sentence.");

    }
}
