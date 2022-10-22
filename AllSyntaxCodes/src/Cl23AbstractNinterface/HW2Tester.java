package Cl23AbstractNinterface;

public class HW2Tester {
    public static void main(String[] args) {
        HW2[] obj={new ChromeDriver(),new FirefoxDriver()};
        for (HW2 webz:obj){
            webz.openBrowser();
            webz.findElement();
            webz.maximizeWindow();
            webz.closeBrowser();
        }


        /*HW2 obj=new ChromeDriver();
        obj.findElement();
        obj.closeBrowser();
        obj.maximizeWindow();
        obj.openBrowser();*/
    }
}
