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
        System.out.println("SYSTEM_PROPS: " + System.getenv());
        driver = new RemoteWebDriver(new URL("https://github.com/BelyukMihail/github-actions/actions/runs/" + System.getenv().get("GITHUB_RUN_ID")), options);
        KarasMainPage karasMainPage = new KarasMainPage(driver);
        driver.quit();
    }
}
