package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.Arrays;

public class LoginTest extends TestBase {

    @DataProvider(name= "validData")
    public Object[][] getValidData() {
        return new Object[][] {
                                {"admin", "admin"},
//                                {"kz01", "password"},
//                                {"tech01", "ouei@#"}
                              };
    }

//    @Test(groups={"regression", "smoke"}, dataProvider = "validData")
//    public void validUsernameAndPassword(String username, String password) {
//    LoginPage loginPage = new LoginPage();
//    loginPage.typeUsername(username);
//    loginPage.typePassword(password);
//        loginPage.clickMenu("Training");
//}
    @Test(groups={"regression", "smoke"})
    public void validUsernameAndPassword() {
        LoginPage loginPage = new LoginPage();
        loginPage.typeUsername("Admin");
        loginPage.typePassword("Admin");

        Assert.assertEquals(loginPage.verifyMemberLoginPageHeader(), "Member Login", "Header text is mismatching");

        Assert.assertTrue(loginPage.verifyJoinUsLinkIsDisplayed(), "Link is NOT displayed");

    }

    @Test(groups={"regression"})
    public void invalidUsernameAndValidPassword() {
        LoginPage loginPage = new LoginPage();

        wait.until(ExpectedConditions.visibilityOf(loginPage.password));

        loginPage.typeUsername("invalid");
        loginPage.typePassword("admin");
    }

    @Test(groups={"regression"})
    public void invalidUsernameAndInvalidPassword() {
        LoginPage loginPage = new LoginPage();

        wait.until(ExpectedConditions.visibilityOf(loginPage.username));

        loginPage.typeUsername("invalid");
        loginPage.typePassword("invalid");
    }

}
