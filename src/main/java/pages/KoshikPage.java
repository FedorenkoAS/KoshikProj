package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KoshikPage extends ParentPage {


    @FindBy(id = "city24")
    WebElement city24;

    @FindBy(id = "cartTocart")
    WebElement p2p;

    @FindBy(className = "pool_header")
    WebElement menu;

    @FindBy(xpath = "/html/body/div/div[4]/ul[3]/li[2]/a")
    WebElement support;

    public KoshikPage(WebDriver driver) {
        super(driver);
    }

    public void openKoshikPage() {
        try {
            driver.get("https://koshik.net/");
        } catch (Exception e) {
            Assert.fail("Can not open Koshik");
        }
    }

    public void clickOnElementCity24() {

        actionsWithOurWebElements.clickOnWebElement(city24);
    }

    public void clickOnElementSupport() {

        actionsWithOurWebElements.clickOnWebElement(support);
    }

    public void clickOnElementMenu() {

        actionsWithOurWebElements.clickOnWebElement(menu);
    }

    public void clickOnP2P() {
        actionsWithOurWebElements.clickOnWebElement(p2p);
    }
}
