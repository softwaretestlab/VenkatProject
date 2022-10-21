package SeleniumLearning;

import PropertiesFile.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import BaseClass.OpenBrowser;
import java.io.File;
import java.io.IOException;

public class AT01_NavigateTitleAssertScreenshot {


    @Test
    public void NavHn() throws IOException {
////setting up chromedriver
//        WebDriverManager.chromedriver().setup();
//        // Open the browser
//        WebDriver driver = new ChromeDriver();
//        //maximize browser
//        driver.manage().window().maximize();
//        //navigate to GG website
//        driver.get("https://www.thegoodguys.com.au/");
        OpenBrowser.NavigateToWebsite(ReadPropertiesFile.PropFile("HomePageUrl"));
        // expected title
        String ExpectedTitle = "The Good Guys - Online Electrical & Home Appliances";
        // get title
       String ActualTitle= OpenBrowser.driver.getTitle();
        System.out.println("ActualTitle : "+ActualTitle);
        //Assertion-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        //Assertion-1
        Assert.assertTrue(ActualTitle.contains("Electrical"));
        //Screenshot
        File screenshotFile = ((TakesScreenshot)OpenBrowser.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\softw\\screenshot.png"));

    }

}
