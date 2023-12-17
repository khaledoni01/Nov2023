package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

public class LoginStepdefs {
    @Given("User is in login page")
    public void user_is_in_login_page() {
        BaseTest.driver.get(BaseTest.baseURL);
    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
        LoginPage loginPage = new LoginPage();
        Assert.assertEquals(loginPage.verifyMemberLoginPageHeader(), "Member Login", "Header text is mismatching");
        Assert.assertTrue(loginPage.verifyJoinUsLinkIsDisplayed(), "Link is NOT displayed");

    }

    @When("User provides username {string} and password {string}")
    public void userProvidesUsernameAndPassword(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.typeUsername(username);
        loginPage.typePassword(password);
    }
}
