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

        driver = new RemoteWebDriver(new URL(System.getProperty("selenium_url")), options);
        KarasMainPage karasMainPage = new KarasMainPage(driver);
        driver.quit();
    }
}
