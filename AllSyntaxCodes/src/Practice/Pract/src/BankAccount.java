public class BankAccount {
    String name;
    String username;
    String password;
    String accountType;
    double balance;
    int transferLimit;
    double deifference;
    String confirmPassword;

    void login(){
        if (password.equals(confirmPassword)) {
            System.out.println("You may spend your money!");

        }else {
            System.out.println("You are broke!");
        }
    }
    void transfer(int sendMoney){
        if (sendMoney<balance) {
             deifference=balance-sendMoney;
            System.out.println("Transfer is succesful. Your remaining balance is "+deifference);
        }else {
            System.out.println("Not enough balance");
        }
    }
    void savings(String accountName){
        if (accountType.equals(accountName)){
            System.out.println("This is "+accountName);
        }else {
            System.out.println("Invalid");
        }
    }
    }

