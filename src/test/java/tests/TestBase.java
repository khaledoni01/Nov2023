package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {

    public static WebDriver driver = null;
    public static WebDriverWait wait = null;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"baseURL"})
    public void launchBrowser(String baseURL) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(baseURL);
        wait = new WebDriverWait(driver, 15);
    }

    //    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }

}
