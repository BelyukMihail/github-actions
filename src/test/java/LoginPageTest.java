import com.solvd.project.page.HomePage;
import com.solvd.project.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void checkIfLoginPageOpens() {
        String loginPageTitle = "Авторизация";

        HomePage homePage = new HomePage(driver);
        homePage.openMenu();
        LoginPage loginPage = homePage.clickAuthLoginLink();
        Assert.assertEquals(loginPage.getPageTitle(), loginPageTitle, "Login page titles do not match.");
    }
}
