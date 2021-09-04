import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class CarsLogin {
    public static void main(String[] args) {
        // creating driver object
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);
        System.setProperty("webdriver.chrome.driver", currentDir + "\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // don't touch the code above this line.
        // Locators

        By loginButton =  By.xpath("//*[@id=\"adjustContent\"]/nav/div/div/div/div[2]/ul/li[2]/a");
        By emailfield =  By.xpath("//*[@id=\"modal-login-email\"]");
        By passwordfield =  By.xpath("//*[@id=\"modal-login-password\"]");
        By longinButton2 =  By.xpath("//*[@id=\"frm-login\"]/div/div[3]/button[2]");
        try {
            // launch chrome and go to url
            driver.get("https://Cars.ie");
            driver.findElement(loginButton).click();
            driver.findElement(emailfield).sendKeys("alamgirhussain2011@gmail.com");
            driver.findElement(passwordfield).sendKeys("01738208057Ah@");
            driver.findElement(longinButton2).click();
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