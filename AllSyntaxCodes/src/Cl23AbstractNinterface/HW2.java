package Cl23AbstractNinterface;
/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public interface HW2 {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements HW2{

    @Override
    public void openBrowser() {
        System.out.println("opening ChromeDriver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing ChromeDriver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximizing ChromeDriver");
    }

    @Override
    public void findElement() {
        System.out.println("finding elements ChromeDriver");
    }
}

class FirefoxDriver implements HW2{

    @Override
    public void openBrowser() {
        System.out.println("opening FirefoxDriver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing FirefoxDriver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximizing FirefoxDriver");
    }

    @Override
    public void findElement() {
        System.out.println("finding elements FirefoxDriver");
    }
}