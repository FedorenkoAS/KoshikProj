package City24;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.util.concurrent.TimeUnit;

public class City24Pay {
    WebDriver driver;

    @Test
    public void City24PayMobile() {
        File fileGC = new File("./drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileGC.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://koshik.net/");
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.findElement(By.id("city24")).click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.findElement(By.id("id=1")).click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.findElement(By.id("16217")).click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.findElement(By.id("tel_number")).sendKeys("380969294968");
        driver.findElement(By.id("amount")).sendKeys("150");
        driver.findElement(By.id("ok-btn")).click();
        driver.findElement(By.id("generate-batch-button")).click();
        Assert.assertTrue(driver.findElement(By.className("modal-body")).isDisplayed());
    }
}
