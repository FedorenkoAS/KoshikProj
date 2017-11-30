package City24;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import parentTest.ParentTest;

public class City24Pay extends ParentTest {

    @Test
    public void City24PayMobile() {

        koshikPage.openKoshikPage();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //driver.findElement(By.id("city24")).click();
        koshikPage.clickOnElementCity24();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.findElement(By.id("1")).click();
        city24Category.clickElementMobileCategory();
       // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //driver.findElement(By.id("16217")).click();
        city24MobileService.clickOnElementKyivstar();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //driver.findElement(By.id("tel_number")).sendKeys("380969294968");
        city24MobileKyivstar.sendKeysIntoTelNumber("380961830632");
        //driver.findElement(By.id("amount")).sendKeys("150");
        city24MobileKyivstar.sendKeysIntoAmount("150");
        //driver.findElement(By.id("ok-btn")).click();
        city24MobileKyivstar.clickOnButtonAdd();
        //driver.findElement(By.id("generate-batch-button")).click();
        listOfAddedPaymentsPage.clickOnButtonGenerateCode();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Assert.assertTrue(driver.findElement(By.className("code_bild")).isDisplayed());
        checkAcceptanceCriteria("Code is not expected", modalWindowGenerateCode.isGenerateCodePresent(), true);
    }

//    @Test
//    public void City24FreeRequisites(){
//
//        koshikPage.openKoshikPage();
//        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
//        driver.findElement(By.id("city24")).click();
//        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
//        driver.findElement(By.name("upay")).click();
//        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
//        driver.findElement(By.id("dest_name")).sendKeys("Федоренко Александр");
//        driver.findElement(By.id("credit_account_number")).sendKeys("31412537700378");
//        driver.findElement(By.id("dest_okpo")).sendKeys("37970621");
//        driver.findElement(By.id("credit_mfo")).sendKeys("837013");
//        driver.findElement(By.id("tran_dest")).sendKeys("Охорона");
//        driver.findElement(By.id("payer_name")).sendKeys("Рижко О.і.");
//        driver.findElement(By.id("tel_number")).sendKeys("380951883656");
//        driver.findElement(By.id("amount")).sendKeys("200");
//        driver.findElement(By.id("ok-btn")).click();
//        driver.findElement(By.id("generate-batch-button")).click();
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        Assert.assertTrue(driver.findElement(By.className("code_bild")).isDisplayed());
//    }
//
//    @Test
//    public void RequestSupport(){
//        koshikPage.openKoshikPage();
//        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
//        driver.findElement(By.xpath(".//*[@href='/Support']")).click();
//        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
//        driver.findElement(By.id("FullName")).sendKeys("Корсун Дмитрий");
//        driver.findElement(By.id("Subject")).sendKeys("Проблемы с платежом");
//        driver.findElement(By.id("Message")).sendKeys("После пополнения терминал не выдал чек");
//        driver.findElement(By.id("phone2")).sendKeys("380969549658");
//        driver.findElement(By.id("Email")).sendKeys("sane4ek1990@gmail.com");
//        driver.findElement(By.className("form_button")).click();
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        Assert.assertTrue(driver.findElement(By.id("results")).isDisplayed());
//    }
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


