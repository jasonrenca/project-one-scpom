package seleniumgluecode;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdminSupervisoresDefinition extends TestBase{

    @When("en Administracion de Supervisores ingresar en el campo buscar {string}")
    public void enAdministracioDeSupervisoresIngresarEnElCampoBuscar(String string) throws Exception {
        adminSupervisoresPage.campoBuscar(string);
    }

    @Then("en Administracion de Supervisores en listado visualizar Nombre Supervisor {string}")
    public void enAdministracionDeSupervisoresEnListadoVisualizarNombreSupervisor(String string) {
        Assert.assertEquals("No se encontro el nombre esperado",string,adminSupervisoresPage.campoNombreSupervisor());
    }
}
