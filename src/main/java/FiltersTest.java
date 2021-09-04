import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class FiltersTest {
    public static void main(String[] args) {
        // creating driver object
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);
        System.setProperty("webdriver.chrome.driver", currentDir + "\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // don't touch the code above this line.
        // Locators

        By BrowseAllCarsbutton =  By.xpath("//*[@id=\"quick-search\"]/div/div[3]/div[2]/a");
        By MinimumPricelink =  By.xpath("//*[@id=\"filter-price\"]");
        By MaximumPricelink =  By.xpath("//*[@id=\"filter-price\"]");
        try {
            // launch chrome and go to url
            driver.get("https://Cars.ie");
            driver.findElement(BrowseAllCarsbutton).click();
            driver.findElement(MinimumPricelink).sendKeys("1000");
            driver.findElement(MaximumPricelink).sendKeys("5000");
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

