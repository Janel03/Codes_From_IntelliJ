public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
    public static void main(String[] args) {
        AX user = new AX();
        System.out.println(user.getInterest(10000, 0.02));
    }
    double getInterest(double balance, double interest) {
        return balance * interest;
    }}
class Visa extends CreditCard {
    double getInterest(double balance, double interest) {
        return balance * interest;
    }}
class AX extends CreditCard {
    double getInterest(double balance,double interest) {
        return balance * interest;
    }}



