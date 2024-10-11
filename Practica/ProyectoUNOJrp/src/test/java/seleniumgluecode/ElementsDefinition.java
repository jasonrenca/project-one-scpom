package seleniumgluecode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ElementsDefinition extends TestBase{

    @Given("Hace click en la carta de Elements")
    public void hace_click_en_la_carta_de_elements() throws Exception {
        elementsPage.clickCard1();
    }

    @Then("Se muestra correctamente las opciones de {string}")
    public void se_muestra_correctamente_las_opciones_de_elements(String elemets) throws Exception {
        Assert.assertEquals(elemets, elementsPage.homeElementsDisplayed());
    }

    @And("Hace click en la opcion Text Box")
    public void haceClickEnLaOpcionTextBox() throws Exception {
        elementsPage.clickTextBox();
    }

    @Then("Se muestra correctamente el formulario de {string}")
    public void seMuestraCorrectamenteElFormularioDeTextBox(String titletexbox) throws Exception {
        Assert.assertEquals(titletexbox, elementsPage.titleTextBox());
    }

    @And("Ingresa su nombre completo {string}")
    public void ingresaSuNombreCompleto(String name) throws Exception {
        elementsPage.ingresaName(name);
    }

    @And("Ingresa su email {string}")
    public void ingresaSuEmail(String email) throws Exception {
        elementsPage.ingresaEmail(email);
    }

    @And("Ingresa su direccion {string}")
    public void ingresaSuDireccion(String direccion) throws Exception {
        elementsPage.ingresaDireccion(direccion);
    }

    @And("Ingresa su direccion permanente {string}")
    public void ingresaSuDireccionPermanente(String direccPerma) throws Exception {
        elementsPage.ingresaDireccionPerma(direccPerma);
    }

    @And("Hace click en boton Submit")
    public void haceClickEnBotonSubmit() throws Exception {
        elementsPage.clickSubmit();
    }

    @Then("El usuario {string} queda registrado bajo el formulario correctamente")
    public void elUsuarioQuedaRegistradoBajoElFormularioCorrectamente(String name) throws Exception {
        Assert.assertEquals(name, elementsPage.usernameTextBox());

    }

    @And("Hace click en la opcion Radio Button")
    public void haceClickEnLaOpcionRadioButton() throws Exception {
        elementsPage.clickRadioButton();
    }

    @And("Hace click en el radio button Yes")
    public void haceClickEnElRadioButtonYes() throws Exception {
        elementsPage.clickRbYes();
    }

    @And("Valida texto {string} del radio button seleccionado Yes")
    public void validaTextoDelRadioButtonSeleccionadoYes(String yes) throws Exception {
        Assert.assertEquals(yes, elementsPage.txtYes());
    }

    @And("Hace click en el radio button Impressive")
    public void haceClickEnElRadioButtonImpressive() throws Exception {
        elementsPage.clickImpressive();
    }

    @And("Valida texto {string} del radio button seleccionado Impressive")
    public void validaTextoDelRadioButtonSeleccionadoImpressive(String impressive) throws Exception {
        Assert.assertEquals(impressive, elementsPage.txtImpressive());
    }

    @And("Hace click en el radio button Impressive y valida bloqueado")
    public void haceClickEnElRadioButtonImpressiveYValidaBloqueado() {

    }

    @Then("El usuario valida cada radio button correctamente")
    public void elUsuarioValidaCadaRadioButtonCorrectamente() {

    }


}
