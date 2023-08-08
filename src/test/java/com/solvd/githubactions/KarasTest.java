package com.solvd.githubactions;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class KarasTest extends BaseTest {

    @Test
    public void goToMainPageTest() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");

            System.out.println("SYSTEM_PROPS: " + System.getenv().get("GITHUB_RUN_ID"));
            driver = new RemoteWebDriver(new URL("https://github.com/BelyukMihail/github-actions/actions/runs/"+System.getenv().get("GITHUB_RUN_ID")), capabilities);
            KarasMainPage karasMainPage = new KarasMainPage(driver);
            driver.quit();
    }
}
