package com.solvd.githubactions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KarasTest extends BaseTest{

    @Test
    public void goToMainPageTest() {
        driver = new ChromeDriver();
        KarasMainPage karasMainPage = new KarasMainPage(driver);
        driver.quit();

    }
}
