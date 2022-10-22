public class OopAccount {
    String userName;
    String passWord;
    String accountType;
    double balance;
    double sendMony;
    double transferLimit;
    double remain;
    String output = null;

    void login(String comfirmedpass){
        if(!userName.isEmpty() && !passWord.isEmpty()){
            if(passWord.equals(comfirmedpass)){
                output = "You have successfully logged in.";
            }else{
                output = "You have entered wrong password";
            }
        }else{
            output = "Username and password should not be empty";
        }
        System.out.println(output);
    }
    void transferBalance(String nextAccount){
        if(!accountType.equalsIgnoreCase(nextAccount)){
            if(sendMony<balance){
                remain = balance-sendMony;
                output = "you have successfully transfer $" +sendMony+" to "+nextAccount+
                        " account.You have remaining balance is $"+remain;
            }else{
                output = "You do not have enough balance to transfer";
            }

        }else{
            output = "you cannot transfer balance to same account type";
        }
        System.out.println(output);

    }

}

