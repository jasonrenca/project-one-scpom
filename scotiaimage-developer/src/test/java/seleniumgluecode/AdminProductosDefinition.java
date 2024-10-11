package seleniumgluecode;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdminProductosDefinition extends TestBase{

    @When("presionar boton Agregar Producto")
    public void agregarProducto() throws Exception{
        adminProductosPage.presionarBotonAgregarProdcuto();
    }

    @When("ingresar Codigo Producto {string}")
    public void ingresarCodigoProducto(String codigo) throws Exception{
        adminProductosPage.ingresarCodigoProducto(codigo);
    }

    @When("ingresar Nombre Producto {string}")
    public void ingresarNombreProducto(String nombre) throws Exception{
        adminProductosPage.ingresarNombreProducto(nombre);
    }

    @When("ingresar tipo producto {string}")
    public void ingresarTipoProducto(String tipo) throws Exception{
        adminProductosPage.ingresarTipoProducto(tipo);
    }

    @When("presionar boton guardar producto")
    public void guardarProducto() throws Exception{
        adminProductosPage.presionarBotonGuardarProducto();
    }

    @When("presionar boton borrar producto")
    public void borrarProducto() throws Exception{
        adminProductosPage.presionarBotonBorrarProducto();
    }

    @When("presionar boton datos producto")
    public void datosProducto() throws Exception{
        adminProductosPage.presionarDatosProducto();
    }

    @When("presionar boton eliminar producto")
    public void eliminarProducto() throws Exception{
        adminProductosPage.presionarEliminarProducto();
    }

    @When("en buscador de producto ingresar {string}")
    public void buscarProducto(String producto) throws Exception{
        adminProductosPage.buscarProducto(producto);
    }

    @Then("se debe visualizar el mensaje de producto {string}")
    public void seVisualizaMensajeCreacionProducto(String mensaje) throws Exception{
        Assert.assertTrue("no se creó el producto correctamente.",adminProductosPage.productoCreado(mensaje));
    }

    @Then("se debe visualizar en grilla codigo {string}")
    public void seVisualizaGrillaCodigo(String mensaje) throws Exception{
        Assert.assertEquals("no se encontro el codigo esperado.", mensaje,adminProductosPage.getTextLabelCodigoProducto());
    }

    @Then("se debe visualizar en grilla nombre producto {string}")
    public void seVisualizaGrillaNombre(String mensaje) throws Exception{
        Assert.assertEquals("no se encontro el nombre esperado.", mensaje,adminProductosPage.getTextLabelNombreProducto());
    }

    @Then("se debe visualizar el mensaje de eliminar {string}")
    public void seVisualizaMensajeEliminarProducto(String mensaje) throws Exception{
        Assert.assertTrue("no se elimino el producto correctamente.",adminProductosPage.productoBorrado(mensaje));
    }

    @Then("presionar boton finalizar producto")
    public void presionarBotonFinalizar() throws Exception{
        adminProductosPage.presionarBotonFinalizar();
    }

    @Then("presionar boton finalizar borrar")
    public void presionarBotonFinalizarEliminar() throws Exception{
        adminProductosPage.presionarBotonFinalizarEliminar();
    }

    @Then("se debe visualiar en la tabla productos {string}")
    public void deboVisualizarTabla(String string) {
        Assert.assertEquals("No se encontro mensaje esperado", string,adminProductosPage.getTextLabelDataTable());
    }
}
