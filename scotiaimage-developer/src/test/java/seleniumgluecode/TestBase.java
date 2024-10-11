package seleniumgluecode;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pom.*;

public class TestBase {

    protected ChromeDriver driver = Hooks.getDriver();
    protected LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    protected AdminUsuariosPage adminUsuariosPage = PageFactory.initElements(driver, AdminUsuariosPage.class);
    protected InformesPage informesPage = PageFactory.initElements(driver, InformesPage.class);
    protected MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
    protected OperacionesPorCursarPage operacionesPorCursarPage = PageFactory.initElements(driver, OperacionesPorCursarPage.class);
    protected AdminMatrizPage adminMatrizPage = PageFactory.initElements(driver, AdminMatrizPage.class);
    protected AdminPerfilesPage adminPerfilesPage = PageFactory.initElements(driver, AdminPerfilesPage.class);
    protected AdminVendedoresPage adminVendedoresPage = PageFactory.initElements(driver, AdminVendedoresPage.class);
    protected AdminProyectosPage adminProyectosPage = PageFactory.initElements(driver, AdminProyectosPage.class);
    protected AdminSupervisoresPage adminSupervisoresPage = PageFactory.initElements(driver, AdminSupervisoresPage.class);
    protected AdminFlujoPage adminFlujoPage = PageFactory.initElements(driver, AdminFlujoPage.class);
    protected AdminReparosPage adminReparosPage = PageFactory.initElements(driver, AdminReparosPage.class);
    protected MantencionNotificacionesPage mantencionNotificacionesPage = PageFactory.initElements(driver, MantencionNotificacionesPage.class);
    protected AdminEjecutivosPage adminEjecutivosPage = PageFactory.initElements(driver, AdminEjecutivosPage.class);
    protected AdminMonitoreoOperacionesPage adminMonitoreoOperacionesPage = PageFactory.initElements(driver, AdminMonitoreoOperacionesPage.class);
    protected AdminProductosPage adminProductosPage = PageFactory.initElements(driver, AdminProductosPage.class);
    protected MantenedorSegurosPage  mantenedorSegurosPage= PageFactory.initElements(driver, MantenedorSegurosPage.class);
    protected MantenedorRelacionesPage  mantenedorRelacionesPage= PageFactory.initElements(driver, MantenedorRelacionesPage.class);
    protected AdminBancaPage adminBancaPage = PageFactory.initElements(driver, AdminBancaPage.class);
    protected MantenedorRelacionesCheckPage mantenedorRelacionesCheckPage = PageFactory.initElements(driver, MantenedorRelacionesCheckPage.class);
    protected AdminProyectosBetaPage adminProyectosBetaPage = PageFactory.initElements(driver, AdminProyectosBetaPage.class);
    protected MantencionOnboardingPage mantencionOnboardingPage = PageFactory.initElements(driver, MantencionOnboardingPage.class);
    protected CurseDeOperacionesPage curseDeOperacionesPage = PageFactory.initElements(driver, CurseDeOperacionesPage.class);
    protected ConsultaGeneralPage consultaGeneralPage = PageFactory.initElements(driver, ConsultaGeneralPage.class);
    protected RevisionCreditosPage revisionCreditosPage = PageFactory.initElements(driver, RevisionCreditosPage.class);
    protected AdminEstadosEnCursoPage adminEstadosEnCursoPage = PageFactory.initElements(driver, AdminEstadosEnCursoPage.class);
    protected ConsultaEstadosFinalesPage consultaEstadosFinalesPage = PageFactory.initElements(driver, ConsultaEstadosFinalesPage.class);
    protected InformeGestionPage informeGestionPage = PageFactory.initElements(driver, InformeGestionPage.class);
    protected AdminCamposPorPerfilPage adminCamposPorPerfilPage = PageFactory.initElements(driver, AdminCamposPorPerfilPage.class);
    protected MantenedorProveedoresPage mantenedorProveedoresPage = PageFactory.initElements(driver, MantenedorProveedoresPage.class);
    protected MantenedorGestoresPage mantenedorGestoresPage = PageFactory.initElements(driver, MantenedorGestoresPage.class);
    protected MantenedorZonasPage mantenedorZonasPage = PageFactory.initElements(driver, MantenedorZonasPage.class);
    protected MantenedorNotariaPage mantenedorNotariaPage = PageFactory.initElements(driver, MantenedorNotariaPage.class);
    protected MantenedorConservadorPage mantenedorConservadorPage = PageFactory.initElements(driver, MantenedorConservadorPage.class);
    protected MantenedorAlzantePage mantenedorAlzantePage = PageFactory.initElements(driver, MantenedorAlzantePage.class);
}
