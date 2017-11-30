package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class City24MobileService extends ParentPage {

    public City24MobileService(WebDriver driver) {super(driver);}

    @FindBy(id = "16217")
    WebElement kyivstar;

    public void clickOnElementKyivstar(){
        actionsWithOurWebElements.clickOnWebElement(kyivstar);
    }

}
