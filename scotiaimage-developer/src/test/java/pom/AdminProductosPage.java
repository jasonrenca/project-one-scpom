package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminProductosPage extends BasePage {

    //variables--------------------------------------------------------
    private final Integer espera = 5;
    private String nivel = "a";
    private String nivel2 = "b";
    private boolean iguales;
    String validacion = null;
    String str = null;
    String strNew = null;
    String result = null;
    int total = 0;
    int row_num = 1;

    //Notaciones------------------------------------------------------
    @FindBy(css = "#tblProducto_filter > label > input[type=search]")
    private WebElement inputBuscar;

    @FindBy(css = "#tblBotonera > tbody > tr > td > input")
    private WebElement agregarProductoBtn;

    @FindBy(id = "tbProductoCodigo")
    private WebElement inputCodigoProducto;

    @FindBy(id = "tbProductoNombre")
    private WebElement inputNombreProducto;

    @FindBy(id = "tbProductoTipo")
    private WebElement inputTipoProducto;

    @FindBy(css = "#frmDatosProyecto > div.modal-footer > button:nth-child(1)")
    private WebElement btnGuardarProducto;

    @FindBy(id = "alertDatosMatriz")
    private WebElement alertaDatosProducto;

    @FindBy(id = "btFinalizar")
    private WebElement btnFinalizar;

    @FindBy(css = "#tblProducto > tbody > tr > td:nth-child(3) > a:nth-child(1)")
    private WebElement datosProductoBtn;

    @FindBy(css = "#tblProducto > tbody > tr > td:nth-child(3) > a:nth-child(2)")
    private WebElement eliminarProductoBtn;

    @FindBy(css = "#modalBorrarProducto > div > div > div.modal-body")
    private WebElement alertaBorrarProducto;

    @FindBy(css = "#modalBorrarProducto > div > div > div.modal-footer > button:nth-child(1)")
    private WebElement btnBorrarProducto;

    @FindBy(css = ".modal-content > .modal-footer > #btFinalizar")
    private WebElement btnFinalizarBorrarProducto;

    @FindBy(css = "#tblProducto > tbody > tr:nth-child(1) > td.sorting_1")
    private WebElement textCodigoProducto;

    @FindBy(css = "#tblProducto > tbody > tr:nth-child(1) > td:nth-child(2)")
    private WebElement textNombreProducto;

    @FindBy(id = "tblProducto_info")
    private WebElement registroTotalProducto;

    @FindBy(id = "tblProducto_next")
    private WebElement btnNextProducto;

    @FindBy(css = "#tblProducto > tbody > tr > td")
    private WebElement dataTable;

    @FindBy(id = "tblProducto")
    private WebElement tableProducto;

    @FindBy(className = "sorting_1")
    private WebElement resultColumna;

    public AdminProductosPage(WebDriver driver) {
        super(driver);
    }

    public void presionarBotonAgregarProdcuto() throws Exception {
        this.waitUntilElementIsVisible(agregarProductoBtn);
        this.click(agregarProductoBtn);
    }

    public void presionarBotonGuardarProducto() throws Exception{
        this.waitUntilElementIsVisible(btnGuardarProducto);
        this.click(btnGuardarProducto);
    }

    public void presionarBotonFinalizar() throws Exception{
        this.waitUntilElementIsVisible(btnFinalizar);
        this.click(btnFinalizar);
    }

    public void presionarDatosProducto() throws Exception{
        this.waitUntilElementIsVisible(datosProductoBtn);
        this.click(datosProductoBtn);
    }

    public void presionarBotonFinalizarEliminar() {
        this.waitUntilElementIsVisible(btnFinalizarBorrarProducto);
        this.executor(btnFinalizarBorrarProducto);
        this.waitFor(espera);
    }

    public void presionarEliminarProducto() throws Exception{
        this.waitUntilElementIsVisible(eliminarProductoBtn);
        this.click(eliminarProductoBtn);
    }

    public void presionarBotonBorrarProducto() throws Exception{
        this.waitUntilElementIsVisible(btnBorrarProducto);
        this.click(btnBorrarProducto);
    }

    public void ingresarCodigoProducto(String codigo) throws Exception{
        this.waitUntilElementIsVisible(inputCodigoProducto);
        this.click(inputCodigoProducto);
        this.clear(inputCodigoProducto);
        this.sendKeys(inputCodigoProducto, codigo);
    }

    public void ingresarNombreProducto(String nombre) throws Exception{
        this.waitUntilElementIsVisible(inputNombreProducto);
        this.click(inputNombreProducto);
        this.clear(inputNombreProducto);
        this.sendKeys(inputNombreProducto, nombre);
    }

    public void ingresarTipoProducto(String tipo) throws Exception{
        this.waitUntilElementIsVisible(inputTipoProducto);
        this.click(inputTipoProducto);
        this.clear(inputTipoProducto);
        this.sendKeys(inputTipoProducto, tipo);
    }

    public boolean productoCreado(String mensaje) {
        this.waitUntilElementIsVisible(alertaDatosProducto);
        this.waitFor(espera);
        return validaTextoMensaje(mensaje, alertaDatosProducto);
    }

    public boolean productoBorrado(String mensaje) {
        this.waitUntilElementIsVisible(alertaBorrarProducto);
        this.waitFor(espera);
        return validaTextoMensaje(mensaje, alertaBorrarProducto);
    }

    public void buscarProducto(String producto) throws Exception{
        this.waitUntilElementIsVisible(inputBuscar);
        this.click(inputBuscar);
        this.clear(inputBuscar);
        this.sendKeys(inputBuscar, producto);
    }

    public String getTextLabelCodigoProducto(){
        this.waitUntilElementIsVisible(textCodigoProducto);
        return textCodigoProducto.getText();
    }

    public String getTextLabelNombreProducto() {
        this.waitUntilElementIsVisible(textNombreProducto);
        return textNombreProducto.getText();
    }

    public String getTextLabelDataTable() {
        this.waitUntilElementIsVisible(dataTable);
        return dataTable.getText();
    }

    public void listadoCodigoGrillaProducto() {
        this.waitUntilElementIsVisible(registroTotalProducto);
        this.listarGrillaComparacion(tableProducto, btnNextProducto, nivel, nivel2, iguales);
    }

}
