package tests;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Appium_CalculatorTest {

    Anasayfa anasayfa = new Anasayfa();


    @Test
    public void test01() {

        anasayfa.setUp("Cal");

    }
}
