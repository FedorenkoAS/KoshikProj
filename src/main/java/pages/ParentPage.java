package pages;

import libs.ActionsWithOurWebElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {
    WebDriver driver;
    ActionsWithOurWebElements actionsWithOurWebElements;


    public ParentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        actionsWithOurWebElements = new ActionsWithOurWebElements(driver);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void checkTitle(String title) {
        Assert.assertEquals("Title not expected", getTitle(), title);
    }
}
