package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class City24Category extends ParentPage{

    public City24Category(WebDriver driver){super(driver);}

    @FindBy(id = "1")
    WebElement mobileCategory;

    public void clickElementMobileCategory(){
        actionsWithOurWebElements.clickOnWebElement(mobileCategory);
    }
}
