package com.solvd.githubactions;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class KarasTest extends BaseTest {

    @Test
    public void goToMainPageTest() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
//        options.setCapability("cookieEnabled",true);
        System.out.println("SYSTEM_PROPS: " + System.getenv("GITHUB_OUTPUT"));
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        KarasMainPage karasMainPage = new KarasMainPage(driver);
        driver.quit();
    }
}
