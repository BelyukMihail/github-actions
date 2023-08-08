package com.solvd.githubactions;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Properties;

public class KarasTest extends BaseTest {

    @Test
    public void goToMainPageTest() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        Properties properties = System.getProperties();
        System.out.println("SYSTEM_PROPS: " + properties.getProperty("url"));
        driver = new RemoteWebDriver(capabilities);
        KarasMainPage karasMainPage = new KarasMainPage(driver);
        driver.quit();

    }
}
