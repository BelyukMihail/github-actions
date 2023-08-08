package com.solvd.project;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProjectDriverFactory {

    protected WebDriver driver;

    public ProjectDriverFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
