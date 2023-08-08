package com.solvd.project.service;

import com.solvd.project.ProjectDriverFactory;
import com.solvd.project.page.ClientPage;
import com.solvd.project.page.HomePage;
import com.solvd.project.page.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginService extends ProjectDriverFactory {

    public LoginService(WebDriver driver) {
        super(driver);
    }

    public ClientPage login(String login, String password) {
        HomePage homePage = new HomePage(driver);
        homePage.openMenu();
        LoginPage loginPage = homePage.clickAuthLoginLink();
        return loginPage.completeLogin(login, password);
    }
}
