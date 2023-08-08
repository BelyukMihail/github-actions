package com.solvd.project.page;

import com.solvd.project.ProjectDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends ProjectDriverFactory {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    protected WebElement checkIfElementIsInteractable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOf(element)
                .andThen(visEl->wait.until(ExpectedConditions.elementToBeClickable(visEl))));
    }
}
