package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Anasayfa {

    public static AndroidDriver<AndroidElement> driver;

    public void setUp(String apk) throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion","11.0");
        desiredCapabilities.setCapability("deviceName", "Pixel API 30");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\ahmet\\IdeaProjects\\Appium01\\src" +
                                                         "\\Apps\\"+apk+".apk");

        desiredCapabilities.setCapability("noReset","true");

        driver =new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"),
                desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }


}
