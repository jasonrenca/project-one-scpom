package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class HomeDefinition extends TestBase{

    @Given("El usuario se encuentra en la pagina Home de QA Demo")
    public void elUsuarioSeEncuentraEnLaPaginaHomeDeQADemo() throws Exception {
        Assert.assertTrue(homePage.homePageisDisplayed());

    }

    @When("Hace click sobre la imagen ToolsQA")
    public void haceClickSobreLaImagenToolsQA() throws Exception {
        homePage.clickOnImgToolsQA();
    }

    @Then("Se debe redirigir a la misma pantalla")
    public void seDebeRedirigirALaMismaPantalla() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina de Comics", homePage.homePageisDisplayed());
    }


}




