import com.solvd.project.page.HomePage;
import org.testng.annotations.Test;

public class CatalogTest extends BaseTest {

    @Test
    public void checkIfSpecifiedProductCategoryOpens() {
        String category = "Удилища";

        HomePage homePage = new HomePage(driver);
        homePage.getCategoryPageByName(category);
    }
}
