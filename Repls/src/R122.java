public class R122 {
    static String countryName;
    static String capital;
    static int size;
    void display(){
        System.out.println("The capital of "+countryName+" is "+capital+" and population is "+size);
    }
    void display2() {
        System.out.println("The capital of " + countryName + " is " + capital + " and population is " + size);
    }
    public static void main(String[] args) {
        R122 print=new R122();
        countryName="USA";
        capital="Washington DC";
        size=330000000;
        print.display();

        R122 print2=new R122();
        countryName="Kazakhstan";
        capital="Astana";
        size=18500000;
        print2.display();
    }}


