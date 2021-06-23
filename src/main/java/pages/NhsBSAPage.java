package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NhsBSAPage extends BasePage {
    public NhsBSAPage(WebDriver driver) {
        super(driver);
    }

    //identify locator

    @FindBy(id = "next-button")
    private WebElement startLocator;

    @FindBy(id = "label-wales")
    private WebElement walesLocator;

    @FindBy(id = "dob-day")
    private WebElement daysLocator;

    @FindBy(id = "dob-month")
    private WebElement monthsLocator;

    @FindBy(id = "dob-year")
    private WebElement yearsLocator;

    @FindBy(id = "label-no")
    private WebElement noLocator;

    @FindBy(id = "label-yes")
    private WebElement yesLocator;

    @FindBy(id = "FREE-heading")
    private WebElement outputLocator;

    @FindBy(id = "result-heading")
    private WebElement resultingHeadingLocator;


    //methods
    public void clickStart() {
        startLocator.click();
    }

    public void clickWales() {
        walesLocator.click();
    }

    public void clickNoRadioButton() {
        click(noLocator);
    }

    public void clickYesRadioButton() {
        yesLocator.click();
    }

    public void enterDay(String day) {
        sendKeys(daysLocator, day);
    }

    public void enterMonth(String month) {
        sendKeys(monthsLocator, month);
    }

    public void enterYear(String year) {
        sendKeys(yearsLocator, year);
    }

    public String getFreePrescription() {
        return outputLocator.getText();
    }
    public String getResultingHeading() {
        return resultingHeadingLocator.getText();
    }
}
