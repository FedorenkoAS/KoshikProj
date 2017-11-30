package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P2PPage extends ParentPage {

    @FindBy(className = "title text-center")
    WebElement P2Ptitle;

    public P2PPage(WebDriver driver) {
        super(driver);
    }
}
