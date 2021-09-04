import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class CarsResg {
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
        By Signuplink =  By.xpath("//*[@id=\"frm-login\"]/div/div[2]/p[1]/a");
        By Emaillink =  By.xpath("//*[@id=\"modal-sign-up-email\"]");
        By namelink =  By.xpath("//*[@id=\"modal-sign-up-name\"]");
        By passwordlink =  By.xpath("//*[@id=\"modal-sign-up-password\"]");
        By confirmpasswordlink =  By.xpath("//*[@id=\"modal-sign-up-confirm-password\"]");
        By signupButton =  By.xpath("//*[@id=\"sign-up\"]");


        try {
            // launch chrome and go to url
            driver.get("https://Cars.ie");
            driver.findElement(loginButton).click();
            driver.findElement(Signuplink).click();
            driver.findElement(Emaillink).sendKeys("alamgirhussain2011@gmail.com");
            driver.findElement(namelink).sendKeys("alamgir hussain");
            driver.findElement(passwordlink).sendKeys("01738208057Ah@");
            driver.findElement(confirmpasswordlink).sendKeys("01738208057Ah@");
            driver.findElement(signupButton).click();


            // Don't touch the code below this line
            System.out.println("Your Test Passed");
            // sleeping the execution for 4000 milly sec
            try {
                Thread.sleep(40000);
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
