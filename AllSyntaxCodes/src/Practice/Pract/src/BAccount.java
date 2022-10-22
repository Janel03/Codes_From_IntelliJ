public class BAccount {
    public static void main(String[] args) {
        BankAccount puskar = new BankAccount();

        puskar.password="blabla";
        puskar.balance=3000.99;
        puskar.confirmPassword="blabla";
        puskar.accountType="savings";
        puskar.login();
        puskar.savings("savings");

        puskar.transfer(500);
    }
}
