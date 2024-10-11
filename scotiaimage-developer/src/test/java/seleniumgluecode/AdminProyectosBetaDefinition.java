package seleniumgluecode;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminProyectosBetaDefinition extends TestBase{

    @When("presionar boton listado")
    public void presionarListado() throws Exception{
        adminProyectosBetaPage.presionarListado();
    }

    @Then("obtener el listado de proyectos")
    public void obtenerListadoProyectos() throws Exception{
        adminProyectosBetaPage.listadoProyectoGrilla();
    }

}
