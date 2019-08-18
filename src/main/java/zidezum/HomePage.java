package zidezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".m-btn.front-banner__btn")
    private List<WebElement> firstPageButtons;

    public ApplyToDrivePage clickApplyToDriveButton() {
        firstPageButtons.get(1).click();
        return new ApplyToDrivePage(driver);
    }





}
