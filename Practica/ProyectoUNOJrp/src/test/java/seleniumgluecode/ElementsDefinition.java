package seleniumgluecode;

import io.cucumber.java.en.And;
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

    @And("Hace click en la opcion Text Box")
    public void haceClickEnLaOpcionTextBox() throws Exception {
        elementsPagePage.clickTextBox();
    }

    @Then("Se muestra correctamente el formulario de {string}")
    public void seMuestraCorrectamenteElFormularioDeTextBox(String titletexbox) throws Exception {
        Assert.assertEquals(titletexbox, elementsPagePage.titleTextBox());
    }

    @And("Ingresa su nombre completo {string}")
    public void ingresaSuNombreCompleto(String name) throws Exception {
        elementsPagePage.ingresaName(name);
    }

    @And("Ingresa su email {string}")
    public void ingresaSuEmail(String email) throws Exception {
        elementsPagePage.ingresaEmail(email);
    }

    @And("Ingresa su direccion {string}")
    public void ingresaSuDireccion(String direccion) throws Exception {
        elementsPagePage.ingresaDireccion(direccion);
    }

    @And("Ingresa su direccion permanente {string}")
    public void ingresaSuDireccionPermanente(String direccPerma) throws Exception {
        elementsPagePage.ingresaDireccionPerma(direccPerma);
    }

    @And("Hace click en boton Submit")
    public void haceClickEnBotonSubmit() throws Exception {
        elementsPagePage.clickSubmit();
    }

    @Then("El usuario {string} queda registrado bajo el formulario correctamente")
    public void elUsuarioQuedaRegistradoBajoElFormularioCorrectamente(String name) throws Exception {
        Assert.assertEquals(name, elementsPagePage.usernameTextBox());

    }
}
