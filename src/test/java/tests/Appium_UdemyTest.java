package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;
import static tests.Anasayfa.driver;

public class Appium_UdemyTest {

        Anasayfa anasayfa = new Anasayfa();

        @Test
        public void test() throws MalformedURLException, InterruptedException {

            //Launches Udemy app on android device
            anasayfa.setUp("UDEM");

            //Click on Browse button
            driver.findElementById("com.udemy.android:id/browse_button").click();
            Thread.sleep(5000);

            //Click on search button
            driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Search tab\"]/" +
                                            "android.widget.ImageView").click();

            //Write ISTQB on search textbox
            Thread.sleep(2000);
            MobileElement searchBox = driver.findElementById("com.udemy.android:id/search_bar_text");
            searchBox.click();
            searchBox.sendKeys("ISTQB");

            //Verifies taht ISTQB courses are able listed
            driver.pressKey(new KeyEvent(AndroidKey.ENTER));
            String expectedText ="ISTQB";
            String actualText =driver.findElementById("com.udemy.android:id/course_title").getText();
            assertTrue(actualText.contains(expectedText));
        }



}
