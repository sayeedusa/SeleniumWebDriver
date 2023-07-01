import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class TestNgWebDrive {
    public String baseURL="http://www.google.com/";
    public WebDriver driver;
    public TestNgWebDrive() {
    }

    @BeforeTest
    public  void setBaseUrl() throws Exception {
     driver=new FirefoxDriver(); 
     driver.get(baseURL);
    }
@Test
public void verifyTitle(){
    String expectedTitle="google";
    String actualTitle=driver.getTitle();
    assertEquals(actualTitle, expectedTitle);
}
    @AfterTest
    public  void endsession() throws Exception {
        driver.quit();
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
