package P2P;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parentTest.ParentTest;

import java.util.concurrent.TimeUnit;


public class CheckP2Ppage extends ParentTest{
    WebDriver driver;


    @Test
    public void CheckP2PTitle() {
        koshikPage.openKoshikPage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("cartTocart")).click();
       // driver.findElement(By.xpath(".//*[@href='/P2P']")).click();
        Assert.assertTrue(driver.findElement(By.className("title text-center")).isDisplayed());
        //driver.findElement(By.name("переказ з карты на карту"));
    }


}
