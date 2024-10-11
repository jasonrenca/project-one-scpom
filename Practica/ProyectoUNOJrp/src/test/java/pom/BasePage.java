package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(WebElement element) throws Exception {
        try{
            element.click();
        }catch (Exception e){
            throw new Exception("No se pudo hacer click sobre el Elemento" + element);
        }

    }

    public boolean isDisplayed(WebElement element) throws Exception {
        try{
            return element.isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento" + element);
        }

    }

    public String getText(WebElement element) throws Exception {
        try{
            return element.getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el Texto del Elemento" + element);
        }

    }

    public String getTittle() throws Exception {
        try{
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el Titulo del driver");
        }

    }

    public void clear(WebElement element) throws Exception {
        try {
            element.clear();
            element.sendKeys(Keys.ARROW_LEFT);
        } catch (Exception e) {
            throw new Exception("No se encontró el elemento: " + element);
        }
    }

    public void sendKeys(WebElement element, CharSequence parametro) throws Exception {
        try {
            element.sendKeys(parametro);
        } catch (Exception e) {
            throw new Exception("No se puede ingresar caracteres sobre el elemento: " + element);
        }
    }




}
