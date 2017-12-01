package libs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsWithOurWebElements {
    WebDriver driver;
    WebDriverWait webDriverWait;

    public ActionsWithOurWebElements(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 10);
    }

    public void enterTextInToInput(WebElement input, String text) {
        try {
            input.clear();
            input.sendKeys(text);
        } catch (Exception e) {
            Assert.fail("Can not work with input");
        }
    }

    public void clickOnWebElement(WebElement element) {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(element));
            element.click();
        } catch (Exception e) {
            Assert.fail("Can not work with element");
        }
    }

    public boolean isElementPresent(WebElement element) {
        try {
//            boolean a = element.isDisplayed();
//            boolean b = element.isEnabled();
            webDriverWait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed() && element.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isElementPresent(String locator) {
        try {
            WebElement webElement = driver.findElement(By.xpath(locator));
            return webElement.isDisplayed() && webElement.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

}
