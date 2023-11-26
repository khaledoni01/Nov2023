package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TestBase;

import java.util.List;

public class LoginTest extends TestBase {

    @Test
    public void validUsernameAndPassword() {
        LoginPage loginPage = new LoginPage();
        loginPage.typeUsername("admin");
        loginPage.typePassword("admin");
        loginPage.clickMenu("Training");
    }

    @Test
    public void invalidUsernameAndValidPassword() {
        LoginPage loginPage = new LoginPage();

        wait.until(ExpectedConditions.visibilityOf(loginPage.password));

        loginPage.typeUsername("invalid");
        loginPage.typePassword("admin");
    }

    @Test
    public void invalidUsernameAndInvalidPassword() {
        LoginPage loginPage = new LoginPage();

        wait.until(ExpectedConditions.visibilityOf(loginPage.username));

        loginPage.typeUsername("invalid");
        loginPage.typePassword("invalid");
    }

}
