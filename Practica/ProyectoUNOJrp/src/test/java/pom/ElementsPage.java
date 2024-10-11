package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage {


    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[1]")
    WebElement card1;

    @FindBy(xpath = "//div[normalize-space()='Elements']")
    WebElement titleElements;

    @FindBy(xpath = "//span[normalize-space()='Text Box']")
    WebElement textBox;

    @FindBy(xpath = "//h1[normalize-space()='Text Box']")
    WebElement tittleTextBox;

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

    public void clickTextBox() throws Exception {
        this.isDisplayed(textBox);
        this.click(textBox);
    }

    public String titleTextBox() throws Exception {
        return this.getText(tittleTextBox);
    }


}
