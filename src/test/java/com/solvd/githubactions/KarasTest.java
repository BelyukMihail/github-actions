package com.solvd.githubactions;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Properties;

public class KarasTest extends BaseTest {

    @Test
    public void goToMainPageTest()  {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        try (InputStream input = new FileInputStream("src/test/resources/system.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            System.out.println(prop.getProperty("db.password"));
            System.out.println("SYSTEM_PROPS: " + prop.getProperty("url"));
            driver = new RemoteWebDriver(capabilities);
            KarasMainPage karasMainPage = new KarasMainPage(driver);
            driver.quit();

        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
