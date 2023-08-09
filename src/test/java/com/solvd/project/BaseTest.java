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

    protected RemoteWebDriver driver;
    protected LoginService loginService;

    @Parameters("browser")
    @BeforeClass
    public void initializeDriver(String browser) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        try {
            driver = new RemoteWebDriver(new URL("http://0.0.0.0:4444/wd/hub"), capabilities);
//            driver = new RemoteWebDriver(new URL(System.getProperty("selenium_url") + "/wd/hub"), capabilities);
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
