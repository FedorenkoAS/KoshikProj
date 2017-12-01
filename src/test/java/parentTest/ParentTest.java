package parentTest;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;

public class ParentTest {
   protected WebDriver driver;


    public KoshikPage koshikPage;
    public P2PPage p2pPage;
    public City24Category city24Category;
    public City24MobileService city24MobileService;
    public City24MobileKyivstar city24MobileKyivstar;
    public ListOfAddedPaymentsPage listOfAddedPaymentsPage;
    public ModalWindowGenerateCode modalWindowGenerateCode;
    public City24FreeRequisitesPage city24FreeRequisitesPage;
    public SupportPage supportPage;
    private boolean isTestPass = false;


    @Before
    public void setUp() {
        File fileGC = new File("./drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileGC.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        koshikPage = new KoshikPage(driver);
        p2pPage = new P2PPage(driver);
        city24Category = new City24Category(driver);
        city24MobileService = new City24MobileService(driver);
        city24MobileKyivstar = new City24MobileKyivstar(driver);
        listOfAddedPaymentsPage = new ListOfAddedPaymentsPage(driver);
        modalWindowGenerateCode = new ModalWindowGenerateCode(driver);
        city24FreeRequisitesPage = new City24FreeRequisitesPage(driver);
        supportPage = new SupportPage(driver);
    }

    @After
    public void tearDown() {

        driver.quit();
    }
    protected void checkAcceptanceCriteria (String message, boolean actual, boolean expected){
       if(actual != expected) {
       }
        Assert.assertThat(message, actual, is(expected));
        isTestPass = true;
    }

    protected void checkAcceptanceCriteria(String message, String actual, String expected){
        if (!actual.equals(expected)) {
        }
        Assert.assertThat(message, actual, CoreMatchers.is (expected));
        isTestPass = true;
    }

}
