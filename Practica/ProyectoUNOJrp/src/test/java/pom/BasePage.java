package pom;

import org.openqa.selenium.By;
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




}
