import com.solvd.project.page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void checkIfMainPageOpens() {
        String logoTextToCompare = "Товары для рыбалки и тюнинга авто";
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.checkIOfLogoIsDisplayed(), "Logo is not displayed.");
        Assert.assertEquals(homePage.getLogoText(), logoTextToCompare, "Logo text do not match.");
    }
}
