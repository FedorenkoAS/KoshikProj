package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModalWindowGenerateCode extends ParentPage {

    public ModalWindowGenerateCode(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "code_bild")
    WebElement codeBild;

    public boolean isGenerateCodePresent(){
        return actionsWithOurWebElements.isElementPresent(codeBild);
    }
}
