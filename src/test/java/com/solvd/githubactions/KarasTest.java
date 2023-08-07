package com.solvd.githubactions;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class KarasTest extends BaseTest {

    @Test
    public void goToMainPageTest() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        driver = new RemoteWebDriver(new URL(""), capabilities);
        KarasMainPage karasMainPage = new KarasMainPage(driver);
        driver.quit();

    }
}
