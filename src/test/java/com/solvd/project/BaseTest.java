package com.solvd.project;

import com.solvd.project.service.LoginService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    private static final String HUB_URL = "http://localhost:4444/wd/hub";
    protected RemoteWebDriver driver;
    protected LoginService loginService;

    @BeforeClass
    @Parameters(value = "browser")
    public void getChromeDriver(String browser) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        try {
            driver = new RemoteWebDriver(new URL(HUB_URL), capabilities);

//            driver = new RemoteWebDriver(new URL(System.getProperty("selenium_url"+"/wd/hub")), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Couldn't establish connection on provided URL.", e);
        }
        loginService = new LoginService(driver);
    }

    @AfterMethod
    public void closeSession() {
        driver.quit();
    }
}
