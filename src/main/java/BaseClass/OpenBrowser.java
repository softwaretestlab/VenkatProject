package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

    public static WebDriver driver;
    public static void NavigateToWebsite(String url) {

        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        // Open the browser
        driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate to GG website
       // driver.get("https://www.thegoodguys.com.au/");
        driver.get(url);
    }
}