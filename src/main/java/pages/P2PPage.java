package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P2PPage extends ParentPage {

    @FindBy(className = "title text-center")
    WebElement p2ptitle;

    public P2PPage(WebDriver driver) {
        super(driver);
    }

    public boolean isP2PPresent (){
        return actionsWithOurWebElements.isElementPresent("p2ptitle");
    }
}
