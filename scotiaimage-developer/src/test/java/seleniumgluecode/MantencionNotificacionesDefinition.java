package seleniumgluecode;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MantencionNotificacionesDefinition extends TestBase{

    @When("en Administracion de Notificaciones ingresar en el buscador {string}")
    public void enAdministracionDeNotificacionesIngresarEnElBuscador(String string) throws Exception {
        mantencionNotificacionesPage.campoBuscar(string);
    }

    @Then("en Administracion de Notificaciones debe visualizar el nombre de Perfil Envia {string}")
    public void enAdministracionDeNotificacionesDebeVisualizarElNombreDePerfilEnvia(String string) {
        Assert.assertEquals("No se encontro el nombre esperado",string,mantencionNotificacionesPage.campoPerfilEnvia());
    }
}
