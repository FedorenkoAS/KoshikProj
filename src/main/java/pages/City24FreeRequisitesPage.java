package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class City24FreeRequisitesPage extends ParentPage {

    public City24FreeRequisitesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@element-name='upay']")
    WebElement freeRequsities;

    @FindBy(id = "dest_name")
    WebElement recipient;

    @FindBy(id = "credit_account_number")
    WebElement creditNumber;

    @FindBy(id = "dest_okpo")
    WebElement okpo;

    @FindBy(id = "credit_mfo")
    WebElement mfo;

    @FindBy(id = "tran_dest")
    WebElement tranDest;

    @FindBy(id = "payer_name")
    WebElement payer;

    @FindBy(id = "tel_number")
    WebElement telNumber;

    @FindBy(id = "amount")
    WebElement summa;

    @FindBy(id = "ok-btn")
    WebElement buttonAdd;

    public void clickOnFreeRequsities(){
        actionsWithOurWebElements.clickOnWebElement(freeRequsities);
    }

    public void sendKeysInToRecipient(String dest_name) {
        actionsWithOurWebElements.enterTextInToInput(recipient, dest_name);
    }

    public void sendKeysInToCreditNumber(String credit_account_number) {
        actionsWithOurWebElements.enterTextInToInput(creditNumber, credit_account_number);
    }

    public void sendKeysInToOKPO(String dest_okpo) {

        actionsWithOurWebElements.enterTextInToInput(okpo, dest_okpo);
    }

    public void sendKeysInToMFO(String credit_mfo) {

        actionsWithOurWebElements.enterTextInToInput(mfo, credit_mfo);
    }

    public void sendKeysInToTranDest(String tran_dest) {
        actionsWithOurWebElements.enterTextInToInput(tranDest, tran_dest);
    }

    public void sendKeysInToPayerName(String payer_name) {
        actionsWithOurWebElements.enterTextInToInput(payer, payer_name);
    }

    public void sendKeysIntoTelNumber(String tel_number) {
        actionsWithOurWebElements.enterTextInToInput(telNumber, tel_number);
    }

    public void sendKeysIntoAmount(String amount) {
        actionsWithOurWebElements.enterTextInToInput(summa, amount);
    }

    public void clickOnButtonAdd() {

        actionsWithOurWebElements.clickOnWebElement(buttonAdd);
    }

}
