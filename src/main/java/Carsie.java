import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Carsie {
    public static void main(String[] args) {
        // Locators
        By loginLinkLocator = By.xpath("//*[@id=\"adjustContent\"]/nav/div/div/div/div[2]/ul/li[2]/a");
        By loginUserNameInputLocator = By.xpath("//*[@id=\"modal-login-email\"]");
        By loginPasswordInputLocator = By.xpath("//*[@id=\"modal-login-password\"]");
        By loginButtonLocator = By.xpath("//*[@id=\"frm-login\"]/div/div[3]/button[2]");

        // creating driver object
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);
        System.setProperty("webdriver.chrome.driver", currentDir + "\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //setting up url
        String baseUrl = "https://Cars.ie";
        // launch chrome and execute the test steps
        driver.get(baseUrl);

        driver.findElement(loginLinkLocator).click();
        driver.findElement(loginUserNameInputLocator).sendKeys("alamgirhussain2011@gmail.com");
        driver.findElement(loginPasswordInputLocator).sendKeys("01815021306");
        driver.findElement(loginButtonLocator).click();
        // get the actual value of the title
        String actualTitle = driver.getTitle();
        System.out.println("actual title is: " + actualTitle);
        String expectedTitle = "DoneDeal | Ireland's Largest Motor & Classifieds Marketplace";
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        // sleeping the execution for 4000 milly sec
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //close chrome
        driver.close();
    }
}
