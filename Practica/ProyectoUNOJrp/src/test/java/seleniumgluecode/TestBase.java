package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.ElementsPage;
import pom.HomePage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    protected ElementsPage elementsPagePage = PageFactory.initElements(driver, ElementsPage.class);


}
