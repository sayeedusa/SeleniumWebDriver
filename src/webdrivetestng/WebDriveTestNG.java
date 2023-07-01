
package webdrivetestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.assertEquals;


public class WebDriveTestNG {
public static String baseUrl="http://www.google.com/";
public static WebDriver driver;//=new FirefoxDriver();
 
    public static void main(String[] args) throws InterruptedException { 
        System.setProperty("webdriver.gecko.driver","c:\\geckodriver\\geckodriver.exe"); 
        driver=new FirefoxDriver();
        driver.get(baseUrl);
        String str=driver.getTitle();
        veriftTitle();
        System.out.println(" Title is : "+str);
        Thread.sleep(1000);
        driver.quit();
    }
    
        public static void veriftTitle(){
        String expectedTitle="Google";
       String actualTitle=driver.getTitle();
            System.out.println(" Inside verify");
        try{
        assertEquals(actualTitle,expectedTitle);
            System.out.println("Test Passed");
        }catch(Throwable ar){
            System.out.println(" Test Fails");
            System.out.println(" Error "+ar.toString());
            
        }
       // driver.quit();
        } 
        
}
