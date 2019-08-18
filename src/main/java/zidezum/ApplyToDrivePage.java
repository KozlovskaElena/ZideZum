package zidezum;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ApplyToDrivePage extends BasePage{

    public ApplyToDrivePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".form-control ")
    private List<WebElement> inputFields;

    public void inputName(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(inputFields.get(0)));
        inputFields.get(0).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        wait.until(ExpectedConditions.elementToBeClickable(inputFields.get(1)));
        inputFields.get(1).sendKeys(lastName);
    }

    public void inputEmail(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(inputFields.get(2)));
        inputFields.get(2).sendKeys(email);
    }

    public void inputPhoneNumber(String phone) {
        wait.until(ExpectedConditions.elementToBeClickable(inputFields.get(3)));
        inputFields.get(3).sendKeys(phone);
    }
}
