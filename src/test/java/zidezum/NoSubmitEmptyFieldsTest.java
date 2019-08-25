package zidezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class NoSubmitEmptyFieldsTest extends BaseTest {

    private HomePage homePage;
    private ApplyToDrivePage applyToDrivePage;

    @Test
    public void testNoSubmitEmptyFields() {
        homePage = new HomePage(driver);
        applyToDrivePage = homePage.clickApplyToDriveButton();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        applyToDrivePage.clickSubmitButton();

        String actualRes1 = applyToDrivePage.getErrorMessage(0);
        Assert.assertEquals("Please enter a value", actualRes1);

        Assert.assertEquals("Please enter a value", applyToDrivePage.getErrorMessage(2));

        Assert.assertEquals("Please enter a value", applyToDrivePage.getErrorMessage(5));

        Assert.assertEquals("Please enter a value", applyToDrivePage.getErrorMessage(7));

        Assert.assertEquals("Please enter a value", applyToDrivePage.getErrorMessage(9));

        driver.switchTo().defaultContent();

        applyToDrivePage.clickCareerButton();


    }
}
