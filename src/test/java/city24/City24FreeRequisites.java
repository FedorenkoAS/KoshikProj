package city24;

import org.junit.Test;
import parentTest.ParentTest;

public class City24FreeRequisites extends ParentTest{


    @Test
    public void City24FreeRequisites(){

        koshikPage.openKoshikPage();
        koshikPage.clickOnElementCity24();
        city24FreeRequisitesPage.clickOnFreeRequsities();
        city24FreeRequisitesPage.sendKeysInToRecipient("Федоренко Александр");
        city24FreeRequisitesPage.sendKeysInToCreditNumber("31412537700378");
        city24FreeRequisitesPage.sendKeysInToOKPO("37970621");
        city24FreeRequisitesPage.sendKeysInToMFO("837013");
        city24FreeRequisitesPage.sendKeysInToTranDest("Охорона");
        city24FreeRequisitesPage.sendKeysInToPayerName("Рижко О.і.");
        city24FreeRequisitesPage.sendKeysIntoTelNumber("380951883656");
        city24FreeRequisitesPage.sendKeysIntoAmount("200");
        city24FreeRequisitesPage.clickOnButtonAdd();
        listOfAddedPaymentsPage.clickOnButtonGenerateCode();
        checkAcceptanceCriteria("Code is not expected", modalWindowGenerateCode.isGenerateCodePresent(), true);
    }
}
