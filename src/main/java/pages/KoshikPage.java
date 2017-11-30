package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KoshikPage extends ParentPage{


    @FindBy(id = "city24")
    WebElement city24;

    @FindBy (id = "cartTocart")
    WebElement P2P;

   public KoshikPage(WebDriver driver) {super(driver);}

   public void  openKoshikPage(){
        try{
            driver.get("https://koshik.net/");
        } catch (Exception e){
            Assert.fail("Can not open Koshik");
        }
    }

    public void clickOnElementCity24(){
       actionsWithOurWebElements.clickOnWebElement(city24);
    }
}
