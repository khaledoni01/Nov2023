package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.LoginTest;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(LoginTest.driver, this);
    }

    @FindBy(xpath = "//input[@name='swpm_user_name']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='swpm_password']")
    public WebElement password;


    public void typeUsername(String uname) {
        username.sendKeys(uname);
    }

    public void typePassword(String pword) {
        password.sendKeys(pword);
    }


}
