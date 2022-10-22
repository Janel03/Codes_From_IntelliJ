public class BankAcc {
    private String userName;
    private String passWord;
    String accountType;
    double balance;
    double transferMoney;
    boolean isCredit;
    String result = "";

    public BankAcc(String custuserName, String custPassword) {
        userName = custuserName;
        passWord = custPassword;
    }
    public BankAcc(){
    }
    public BankAcc(String cusAccountT,double customeBal, double cusTransferM){
        accountType = cusAccountT;
        balance= customeBal;
        transferMoney = cusTransferM;
    }
    public String login(String confirmedPass) {
        if (!userName.isEmpty()) {
            if (passWord.equals(confirmedPass)) {
                result = "You have successfully login";
            } else {
                result = "Your password does not match";
            }}
        return result;
    }
    public void TransferMoney(String nextAccountType){
        double remain;
        if(!accountType.equalsIgnoreCase(nextAccountType)){
            if(transferMoney<balance){
                remain = balance-transferMoney;
                System.out.println("You have successfully transferred $"+transferMoney
                        +". Your remaining balance $"+remain);
            }else{
                System.out.println("You do not have enough balance.");
            }
        }else{
            System.out.println("You cannot send money to Same Account Type");
        }}}