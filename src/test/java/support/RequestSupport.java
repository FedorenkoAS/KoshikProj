package support;

import org.junit.Test;
import parentTest.ParentTest;

public class RequestSupport extends ParentTest{

    @Test
    public void RequestSupport() {
        koshikPage.openKoshikPage();
        koshikPage.clickOnElementSupport();
        supportPage.sendKeysIntoFullName("Дмитрий Индеец");
        supportPage.sendKeysIntoSubject("Проблемы с платежом");
        supportPage.sendKeysIntoMassage("После пополнения терминал не выдал чек");
        supportPage.sendKeysIntoPhone2("380951356548");
        supportPage.sendKeysIntoEmail("sane4ek1990@gmail.com");
        supportPage.clickOnFormButton();
        checkAcceptanceCriteria("Message to Support is not expected", supportPage.massageToSupportSuccessSent(), true);
    }
}
