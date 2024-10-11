package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage {


    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[1]")
    WebElement card1;

    @FindBy(xpath = "//div[normalize-space()='Elements']")
    WebElement titleElements;

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public void clickCard1() throws Exception {
        this.isDisplayed(card1);
        this.click(card1);
    }

    public String homeElementsDisplayed() throws Exception {
        return this.getText(titleElements);
    }



}
