package tests;

import org.testng.annotations.Test;
import pages.MiscPage;

public class MiscTest extends TestBase {

    @Test
    public void hoverDropdown() {
        MiscPage miscPage = new MiscPage();
        miscPage.actionMethod();
    }

    @Test
    public void chooseMonthDropdown() {
        MiscPage miscPage = new MiscPage();
        miscPage.chooseDropdownOption("Feb");
    }

    @Test
    public void handleAlert() {
        MiscPage miscPage = new MiscPage();
        miscPage.clickAndAccept_AlertButton();
    }
}
