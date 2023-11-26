package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public static WebDriver driver = null;
    public String baseURL = "https://nktechsolutions.com/membership-login/";

    public static WebDriverWait wait = null;

    @BeforeMethod
    public void launchBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(baseURL);
        wait = new WebDriverWait(driver, 10);
    }
    //    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

}
