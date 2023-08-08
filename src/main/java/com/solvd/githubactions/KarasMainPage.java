package com.solvd.githubactions;

import org.openqa.selenium.WebDriver;

public class KarasMainPage extends BasePage {

    public KarasMainPage(WebDriver driver) {
        super(driver);
        driver.get("https://karas.by");
    }
}
