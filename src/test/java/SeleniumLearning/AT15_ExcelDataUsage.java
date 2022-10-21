package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.Xls_Reader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class AT15_ExcelDataUsage {

    @Test
    public void table() throws IOException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //At this point browser will be opened
        WebDriver driver = new ChromeDriver();
          //maximize browser
        driver.manage().window().maximize();
       // Navigate to GG AccountCreation page
        driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Xls_Reader reader=new Xls_Reader("C:\\Users\\softw\\IdeaProjects\\VenkatProject\\src\\main\\java\\Resources\\TestDataHN1.xlsx");
// count of rows in the excel sheet
        int rowcount=reader.getRowCount("RegTestData");
        System.out.println("rowcount :"+rowcount);
        for(int i=2;i<=rowcount;i++){
            String FirstName=reader.getCellData("RegTestData","FirstName",i);
            System.out.println("FirstName : "+FirstName);
            //FistName
            driver.findElement(By.id("regAddForm_firstName")).clear();
            driver.findElement(By.id("regAddForm_firstName")).sendKeys(FirstName);
            //Here we picked up data for LastName from excel
            String lastname=reader.getCellData("RegTestData","LastName",i);
            driver.findElement(By.id("regAddForm_lastName")).clear();
            driver.findElement(By.id("regAddForm_lastName")).sendKeys(lastname);
            //Here we picked up data for Email Address from excel
            String email_address=reader.getCellData("RegTestData","EmailAddress",i);
            driver.findElement(By.id("regAddForm_email1")).clear();
            driver.findElement(By.id("regAddForm_email1")).sendKeys(email_address);
            //Password
            String password=reader.getCellData("RegTestData","Password",i);
            driver.findElement(By.id("regAddForm_password")).clear();
            driver.findElement(By.id("regAddForm_password")).sendKeys(password);
            //reenter password
            String confirmation=reader.getCellData("RegTestData","RePassword",i);
            driver.findElement(By.id("regAddForm_passwordNew")).clear();
            driver.findElement(By.id("regAddForm_passwordNew")).sendKeys(confirmation);
//put data back into excelsheet
            String textName=driver.findElement(By.xpath("//h1[contains(text(),'Create an Account')]")).getText();
            reader.setCellData("RegTestData","Result",i,textName);
        }
    }
}