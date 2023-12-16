package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import stepDef.BaseTest;
import tests.TestBase;

public class CommonActionMethods {

    public static void type(WebElement ele, String value) {
        ele.clear();
        ele.sendKeys(value);
    }

    public static void jsClick(WebElement ele){
        JavascriptExecutor js = (JavascriptExecutor) BaseTest.driver;
        js.executeScript("arguments[0].click();", ele);
    }

}
