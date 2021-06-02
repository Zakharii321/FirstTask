
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver" , "/home/zakharii/testproject/geckodriver");
        WebDriver driver = new FirefoxDriver(); // open browser
        driver.manage().window().maximize(); // maximize for browser window
        driver.get("http://google.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //to do auto-generated catch block
            e.printStackTrace();
        }
        driver.quit(); // close browser
    }
}