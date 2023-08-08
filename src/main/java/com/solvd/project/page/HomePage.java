package com.solvd.project.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    @FindBy(css = "#logo")
    private WebElement logo;

    @FindBy(xpath = "//small[ contains(text(),'Товары для рыбалки')]")
    private WebElement logoText;

    @FindBy(xpath = "//*[contains(text(),' Каталог товаров ')]")
    private WebElement catalogBtn;

    @FindBy(xpath = "//li[@class= 'text-center']/a/div")
    private List<WebElement> categoryListDropdown;

    @FindBy(xpath = "//a[@class='list-group-item']")
    private List<WebElement> categoryList;

    @FindBy(xpath = "//*[contains(text(),'Меню')]")
    private WebElement menuBtn;

    @FindBy(xpath = " //*[contains(text(),'Авторизация / Регистрация')]")
    private WebElement authRegisterBtn;

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://megafishing.by/");
        driver.manage().window().maximize();
    }

    public String getLogoText() {
        return checkIfElementIsInteractable(logoText).getText();
    }

    public boolean checkIOfLogoIsDisplayed() {
        return logo.isDisplayed();
    }

    public void openCatalog() {
        checkIfElementIsInteractable(catalogBtn).click();
    }

    public List<String> getProductCategoryNamesFromCatalog() {
        List<String> categoryNames = new ArrayList<>();
        for (WebElement element : categoryListDropdown) {
            categoryNames.add(checkIfElementIsInteractable(element).getText());
        }
        return categoryNames;
    }

    public void openMenu() {
        checkIfElementIsInteractable(menuBtn).click();
    }

    public LoginPage clickAuthLoginLink() {
        checkIfElementIsInteractable(authRegisterBtn).click();
        return new LoginPage(driver);
    }

    public void getCategoryPageByName(String categoryName) {
        for (WebElement el : categoryList) {
            String catName = el.getText();
            if (categoryName.equals(catName.strip())) {
                el.click();
                break;
            }
        }
    }
}
