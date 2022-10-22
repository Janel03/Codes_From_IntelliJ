public class OoopAccountGettingInfo {
    public static void main(String[] args) {
        OopAccount prakriti = new OopAccount();
        prakriti.userName ="puskrity";
        prakriti.passWord = "balti123";
        prakriti.accountType = "checking";
        prakriti.balance = 5000;
        prakriti.sendMony = 1000;

        prakriti.login("balti123");
        prakriti.transferBalance("checking");

    }


}


