package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListOfAddedPaymentsPage extends ParentPage {

    public ListOfAddedPaymentsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "generate-batch-button")
    WebElement buttonGenerateCode;

    public void clickOnButtonGenerateCode(){
        actionsWithOurWebElements.clickOnWebElement(buttonGenerateCode);
    }

}
