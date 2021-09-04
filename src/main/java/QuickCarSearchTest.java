import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class QuickCarSearchTest {
    public static void main(String[] args) {
        // creating driver object
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);
        System.setProperty("webdriver.chrome.driver", currentDir + "\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // don't touch the code above this line.
        // Locators

        By anymakebutton =  By.xpath("//*[@id=\"quick-search\"]/div/div[1]/div[1]/select");
        By anymodelbutton =  By.xpath("//*[@id=\"model\"]");
        By anyyearbutton =  By.xpath("//*[@id=\"quick-search\"]/div/div[2]/div[1]/select");
        By anycountrybutton =  By.xpath("//*[@id=\"quick-search\"]/div/div[2]/div[2]/select");
        By quickcarsearchbutton =  By.xpath("//*[@id=\"quick-search\"]/div/div[3]/div[1]/a");
        try {
            // launch chrome and go to url
            driver.get("https://Cars.ie");
            driver.findElement(anymakebutton).click();
            driver.findElement(anymodelbutton).click();
            driver.findElement(anyyearbutton).click();
            driver.findElement(anycountrybutton).click();
            driver.findElement(quickcarsearchbutton).click();
            // Don't touch the code below this line
            System.out.println("Your Test Passed");
            // sleeping the execution for 4000 milly sec
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        catch (Exception e) {
            System.out.println("Your Test Failed");
        }
        //close chrome
        driver.close();
    }
}
