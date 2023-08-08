package com.solvd.project.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "#input-email")
    private WebElement emailInput;

    @FindBy(css = "#input-password")
    private WebElement passwordInput;

    @FindBy(css = "[value='Войти']")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void enterEmail(String email) {
        checkIfElementIsInteractable(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        checkIfElementIsInteractable(passwordInput).sendKeys(password);
    }

    public ClientPage completeLogin(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginBtn();
        return new ClientPage(driver);
    }

    public ClientPage clickLoginBtn() {
        checkIfElementIsInteractable(loginBtn).click();
        return new ClientPage(driver);
    }
}


