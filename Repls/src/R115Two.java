public class R115Two {
    String str="test";
    void printTest(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        R115Two callTest=new R115Two();
        callTest.printTest(callTest.str.toUpperCase());

    }
}
