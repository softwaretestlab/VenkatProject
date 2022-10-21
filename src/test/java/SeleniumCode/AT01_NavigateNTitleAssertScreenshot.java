package SeleniumCode;
import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;


import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class AT01_NavigateNTitleAssertScreenshot {

    @Test
    public static void NavHn() throws IOException {
        OpenBrowser.NavigateToWebsite(ReadPropertiesFile.PropFile("HomePageUrl"));
        // implicit wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public static void AssertTitle(){
        //get title
        String ActualTitle = OpenBrowser.driver.getTitle();
        System.out.println("HNTitle : "+ActualTitle);
        String ExpectedTitle = "Computers, Electrical, Furniture & Bedding | Harvey Norman Australia";
        //Assertion Version-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);

    }
}