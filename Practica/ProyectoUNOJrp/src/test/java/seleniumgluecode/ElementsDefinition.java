package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ElementsDefinition extends TestBase{

    @Given("Hace click en la carta de Elements")
    public void hace_click_en_la_carta_de_elements() throws Exception {
        elementsPagePage.clickCard1();
    }

    @Then("Se muestra correctamente las opciones de {string}")
    public void se_muestra_correctamente_las_opciones_de_elements(String elemets) throws Exception {
        Assert.assertEquals(elemets, elementsPagePage.homeElementsDisplayed());
    }
}
