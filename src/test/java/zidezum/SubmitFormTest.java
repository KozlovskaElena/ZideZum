package zidezum;

import org.junit.Test;
import org.openqa.selenium.By;

public class SubmitFormTest extends BaseTest {

    private HomePage homePage;
    private ApplyToDrivePage applyToDrivePage;

    @Test
    public void testSubmitForm() {
        homePage = new HomePage(driver);
        applyToDrivePage = homePage.clickApplyToDriveButton();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        applyToDrivePage.inputName(user.getFirstName());
        applyToDrivePage.inputLastName(user.getLastName());
        applyToDrivePage.inputEmail(user.getEmail());
        applyToDrivePage.inputPhoneNumber(user.getPhoneNumber());
    }
}
