package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupportPage extends ParentPage {

    public SupportPage(WebDriver driver) {super(driver);}

    @FindBy(id = "FullName")
    WebElement fullName;

    @FindBy(id = "Subject")
    WebElement subject;

    @FindBy(id = "Message")
    WebElement massage;

    @FindBy(id = "phone2")
    WebElement telNumber2;

    @FindBy(id ="Email")
    WebElement email;

    @FindBy(xpath = ".//*[@type='submit']")
//    @FindBy(id = "form_button")
    WebElement formButton;

    @FindBy(id = "results")
    WebElement succesMessageSupport;

    public void sendKeysIntoFullName(String FullName){
        actionsWithOurWebElements.enterTextInToInput(fullName, FullName);
    }

    public void sendKeysIntoSubject(String Subject){
        actionsWithOurWebElements.enterTextInToInput(subject, Subject);
    }


    public void sendKeysIntoMassage(String Massage){
        actionsWithOurWebElements.enterTextInToInput(massage, Massage);
    }


    public void sendKeysIntoPhone2 (String phone2){
        actionsWithOurWebElements.enterTextInToInput(telNumber2, phone2);
    }


    public void sendKeysIntoEmail (String Email){
        actionsWithOurWebElements.enterTextInToInput(email, Email);
    }

    public void clickOnFormButton(){
        actionsWithOurWebElements.clickOnWebElement(formButton);
    }

    public boolean massageToSupportSuccessSent(){
        return actionsWithOurWebElements.isElementPresent(succesMessageSupport);
    }

}
