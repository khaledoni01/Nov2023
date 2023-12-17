package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import stepDef.BaseTest;

public class MiscPage {

    public MiscPage() {
        PageFactory.initElements(BaseTest.driver, this);
    }

    @FindBy(xpath = "//select[@id='month']")
    public WebElement monthDropdown;
    @FindBy(xpath = "//input[@value='Alert Button']")
    public WebElement alertButton;

    @FindBy(xpath = "//button[text()='Dropdown']")
    public WebElement hoverOverDropdown;


    public void actionMethod() {
        BaseTest.wait.until(ExpectedConditions.visibilityOf(hoverOverDropdown));

        Actions act = new Actions(BaseTest.driver);
        act.moveToElement(hoverOverDropdown).build().perform();
    }

    public void chooseDropdownOption(String month) {
        BaseTest.wait.until(ExpectedConditions.visibilityOf(monthDropdown));
        Select select = new Select(monthDropdown);
        select.selectByVisibleText(month);
    }

    public void clickAndAccept_AlertButton() {
        alertButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Alert a = BaseTest.driver.switchTo().alert();
        a.accept();
    }


}
