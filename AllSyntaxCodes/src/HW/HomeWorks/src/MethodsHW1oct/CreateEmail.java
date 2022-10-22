package MethodsHW1oct;

public class CreateEmail {
    //#5 Create a method createEmail(). Based on values of users name, lastName and email type,
    // your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
    String createAnEmail(String firstName, String lastName, String emailHost){
        return firstName+lastName+"@"+emailHost+".com";
    }

    public static void main(String[] args) {
        CreateEmail email=new CreateEmail();

        System.out.println(email.createAnEmail("john", "snow", "gmail"));
    }

}
