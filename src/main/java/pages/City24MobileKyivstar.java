package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class City24MobileKyivstar extends ParentPage{


    public City24MobileKyivstar(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tel_number")
    WebElement telNumber;

    @FindBy(id = "amount")
    WebElement amount;

    @FindBy(id = "ok-btn")
    WebElement buttonAdd;

    public void sendKeysIntoTelNumber(String tel_number){
    actionsWithOurWebElements.enterTextInToInput(telNumber, tel_number);
    }

    public void sendKeysIntoAmount(String summa) {
        actionsWithOurWebElements.enterTextInToInput(amount, summa);
    }

    public void clickOnButtonAdd(){
        actionsWithOurWebElements.clickOnWebElement(buttonAdd);
    }
}
