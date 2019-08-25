package zidezum;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplyToDrivePage extends BasePage{

    public ApplyToDrivePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".form-control ")
    private List<WebElement> inputFields;

    @FindBy (css = ".btn-apply.js-submit.app-apply-button.application-form__submit-button")
    private WebElement submitButton;

    @FindBy (css = ".main-menu__link")
    private List<WebElement> menuButtons;

    @FindBy (css = ".help-block")
    private List<WebElement> submitErrors;

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

    public void selectAreaByIndex(int index) {
        wait.until(ExpectedConditions.elementToBeClickable(inputFields.get(4)));
        Select select = new Select(inputFields.get(4));
        select.selectByIndex(index);
    }

    public void selectArea(String str) {
        wait.until(ExpectedConditions.elementToBeClickable(inputFields.get(4)));
        Select select = new Select(inputFields.get(4));
        select.selectByVisibleText(str);
    }

    public void inputReffealCode(String code) {
        wait.until(ExpectedConditions.elementToBeClickable(inputFields.get(5)));
        inputFields.get(5).sendKeys(code);
    }

    public void clickCareerButton() {
        wait.until(ExpectedConditions.elementToBeClickable(menuButtons.get(4)));
        menuButtons.get(4).click();
    }

    public void clickSubmitButton() {
//        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }

    public String getErrorMessage(int index) {
        return submitErrors.get(index).getText();
    }
}
