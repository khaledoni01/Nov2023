package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {

    public static WebDriver driver = null;
    public String baseURL = "https://nktechsolutions.com/membership-login/";

    @BeforeMethod
    public void launchBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(baseURL);
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }


    @Test
    public void validUsernameAndPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        Thread.sleep(5000);
        loginPage.typeUsername("admin");
        loginPage.typePassword("admin");
    }

    @Test
    public void invalidUsernameAndValidPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        Thread.sleep(5000);
        loginPage.typeUsername("invalid");
        loginPage.typePassword("admin");
    }

    @Test
    public void invalidUsernameAndInvalidPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        Thread.sleep(5000);
        loginPage.typeUsername("invalid");
        loginPage.typePassword("invalid");
    }

}
