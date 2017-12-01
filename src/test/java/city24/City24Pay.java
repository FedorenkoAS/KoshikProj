package city24;


import org.junit.Test;
import parentTest.ParentTest;

public class City24Pay extends ParentTest {

    @Test
    public void City24PayMobile() {

        koshikPage.openKoshikPage();
        koshikPage.clickOnElementCity24();
        city24Category.clickElementMobileCategory();
        city24MobileService.clickOnElementKyivstar();
        city24MobileKyivstar.sendKeysIntoTelNumber("380961830632");
        city24MobileKyivstar.sendKeysIntoAmount("150");
        city24MobileKyivstar.clickOnButtonAdd();
        listOfAddedPaymentsPage.clickOnButtonGenerateCode();
        checkAcceptanceCriteria("Code is not expected", modalWindowGenerateCode.isGenerateCodePresent(), true);
    }

//
//    @Test
//    public void StatusPay(){
//        koshikPage.openKoshikPage();
//        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
//        driver.findElement(By.xpath(".//*[@href='http://payment.swift-garant.com.ua/']")).click();
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        Assert.assertTrue(driver.findElement(By.className("left")).isDisplayed());
//    }


}


