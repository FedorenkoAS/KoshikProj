package p2p;


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
        koshikPage.clickOnP2P();
        checkAcceptanceCriteria("P2P is open", p2pPage.isP2PPresent(),true);
    }
}
