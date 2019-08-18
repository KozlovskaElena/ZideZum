package zidezum;

import org.junit.Test;

public class ApplyToDriveTest extends BaseTest{
    private HomePage homePage;

    @Test
    public void testApplyToDrive() {
        homePage = new HomePage(driver);

        homePage.clickApplyToDriveButton();

    }

}
