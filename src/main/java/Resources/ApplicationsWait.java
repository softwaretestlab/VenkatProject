package Resources;


import java.util.concurrent.TimeUnit;

import static BaseClass.OpenBrowser.driver;

public class ApplicationsWait {
// implicit wait
    public static void ImplicitWait(int TimeOutLimit) {

    driver.manage().timeouts().implicitlyWait(TimeOutLimit,TimeUnit.SECONDS);

    }
    //Explicit wait

    //PageLoad Time out

    //Fleunt wait

    //Threa.sleep

}
