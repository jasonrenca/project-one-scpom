package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage {

    int espera = 1;

    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[1]")
    WebElement card1;

    @FindBy(xpath = "//div[normalize-space()='Elements']")
    WebElement titleElements;

    @FindBy(id = "item-0")
    WebElement item0;

    @FindBy(xpath = "//h1[normalize-space()='Text Box']")
    WebElement tittleTextBox;

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;

    @FindBy(id = "submit")
    WebElement submit;

    @FindBy(id = "name")
    WebElement name;

    @FindBy(id = "item-2")
    WebElement item2;

    @FindBy(xpath = "//label[normalize-space()='Yes']")
    WebElement yesRadio;

    @FindBy(xpath = "//label[normalize-space()='Impressive']")
    WebElement impressiveRadio;

    @FindBy(id = "noRadio")
    WebElement noRadio;


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
        this.isDisplayed(item0);
        this.click(item0);
    }

    public String titleTextBox() throws Exception {
        return this.getText(tittleTextBox);
    }

    public void ingresaName(String name) throws Exception {
        this.click(userName);
        this.clear(userName);
        this.sendKeys(userName, name);
    }

    public void ingresaEmail(String email) throws Exception {
        this.click(userEmail);
        this.clear(userEmail);
        this.sendKeys(userEmail, email);
    }

    public void ingresaDireccion(String direccion) throws Exception {
        this.click(currentAddress);
        this.clear(currentAddress);
        this.sendKeys(currentAddress, direccion);
    }

    public void ingresaDireccionPerma(String direccPerma) throws Exception {
        this.click(permanentAddress);
        this.clear(permanentAddress);
        this.sendKeys(permanentAddress, direccPerma);
    }

    public void clickSubmit() throws Exception {
        this.isDisplayed(submit);
        this.click(submit);
    }

    public String usernameTextBox() throws Exception {
        return this.getText(name);
    }

    public void clickRadioButton() throws Exception {
        this.waitFor(espera);
        this.isDisplayed(item2);
        this.click(item2);
    }

    public void clickRbYes() throws Exception {
        this.waitFor(espera);
        this.isDisplayed(yesRadio);
        this.click(yesRadio);
    }

    public String txtYes() throws Exception {
        this.waitFor(espera);
        return this.getText(yesRadio);
    }

    public void clickImpressive() throws Exception {
        this.waitFor(espera);
        this.isDisplayed(impressiveRadio);
        this.click(impressiveRadio);
    }

    public String txtImpressive() throws Exception {
        return this.getText(impressiveRadio);
    }


}
