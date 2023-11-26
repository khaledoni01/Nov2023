package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import tests.LoginTest;
import util.CommonActionMethods;

import java.util.List;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(TestBase.driver, this);
    }

    @FindBy(xpath = "//input[@name='swpm_user_name']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='swpm_password']")
    public WebElement password;

    @FindBy(xpath = "//a[@class='menu-link']/span")
    public List<WebElement> menuOptions;


    public void typeUsername(String uname) {
        TestBase.wait.until(ExpectedConditions.visibilityOf(username));
        CommonActionMethods.type(username, uname);
    }

    public void typePassword(String pword) {
        CommonActionMethods.type(password, pword);
    }

    public void clickMenu(String userMenu) {

        for(WebElement m : menuOptions) {
            String menuText = m.getText();

            if(menuText.equals(userMenu)) {
                TestBase.wait.until(ExpectedConditions.elementToBeClickable(m));

                CommonActionMethods.jsClick(m);
//                m.click();
                break;
            }
        }


    }

}
