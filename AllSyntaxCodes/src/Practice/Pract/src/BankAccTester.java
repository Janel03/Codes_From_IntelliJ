public class BankAccTester {
    public static void main(String[] args) {
        BankAcc user = new BankAcc("syntax", "pass123");
        user.login("pass1233");
        BankAcc user2 = new BankAcc("checking", 5000, 1000);
        user2.TransferMoney("saving");


        BankAcc user1 = new BankAcc();
    }
}