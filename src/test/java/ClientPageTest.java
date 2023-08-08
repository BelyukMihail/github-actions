import com.solvd.project.page.ClientPage;
import com.solvd.project.page.HomePage;
import com.solvd.project.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClientPageTest extends BaseTest{

    @Test
    public void checkIfLoginIsSuccessful() {
        String email = "swat60@yandex.ru";
        String password = "Sadist123";
        String clientPageTitle = "Личный Кабинет";

        HomePage homePage = new HomePage(driver);
        homePage.openMenu();
        LoginPage loginPage = homePage.clickAuthLoginLink();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        ClientPage clientPage = loginPage.clickLoginBtn();

        Assert.assertEquals(clientPage.getPageTitle(), clientPageTitle, "Client page titles do not match.");
    }
}
