package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

import java.io.ByteArrayInputStream;


public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;

    @Before
    public void setUp(){

        numberOfCase ++;

        System.out.println("Se está ejecutando el escenario nro: " + numberOfCase);
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("El escenario nro: " + numberOfCase + " se ejecutó correctamente");

        if(scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failed Screeshot", new ByteArrayInputStream(screenshot));
        }

        //driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }


}
