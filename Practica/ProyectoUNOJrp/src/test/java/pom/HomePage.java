package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"app\"]/header/a/img")
    private  WebElement imgToolsQA;

    private String titleHomePage = "DEMOQA";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean homePageisDisplayed() throws Exception {
        return this.getTittle().equals(titleHomePage);
    }

    public void clickOnImgToolsQA() throws Exception {
        this.click(imgToolsQA);
    }

}
