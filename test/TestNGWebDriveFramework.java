import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.*;
import org.testng.annotations.*;

public class TestNGWebDriveFramework {
    WebDriver  driver;
    
    public TestNGWebDriveFramework() {
    }

    @BeforeClass
    public  void TestsetUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","c:\\geckodriver\\geckodriver.exe"); 
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
    }
@BeforeMethod
public void openURL(){
    driver.get("http://www.facebook.com");
    String strTitle=driver.getTitle();
    String strURL=driver.getCurrentUrl();
    System.out.println("Title  "+strTitle +"     "+"URL  "+strURL);
}
@Test(description = "This method Validate the Signup")
public void signUP(){
    driver.findElement(By.id("email")).sendKeys("sayeedlondon@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("blueocean2008");
    driver.findElement(By.id("loginbutton")).click();  
}
       @BeforeMethod
    public void postSignUp() throws Exception {
        System.out.println(" Post signup "+driver.getCurrentUrl());
    }
  
     @AfterClass
    public  void closeURL() throws Exception {
      driver.close();
    }
}
