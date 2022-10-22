package SeleniumCode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT02_CreatAnAccount {
    @Test
   public static void NavToCreateAcc() throws IOException {
       OpenBrowser.NavigateToWebsite(ReadPropertiesFile.PropFile("CreateAccount"));
       // implicit wait
       OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
   @Test
   public static void EnterAccData(String FirstName,String lastname,String email_address){
       OpenBrowser.driver.findElement(By.id("firstname")).clear();
       OpenBrowser.driver.findElement(By.id("firstname")).sendKeys(FirstName);

       //Here we enter lastname
       OpenBrowser.driver.findElement(By.id("lastname")).clear();
       OpenBrowser.driver.findElement(By.id("lastname")).sendKeys(lastname);

       //Here we enter email_address
       OpenBrowser.driver.findElement(By.id("email_address")).clear();
       OpenBrowser.driver.findElement(By.id("email_address")).sendKeys(email_address);
   }
}
