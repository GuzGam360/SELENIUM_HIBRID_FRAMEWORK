package PAGES;

import UTILS.ACTIONS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ExamplePage {

    public static void clickOnButtonElement(WebDriver driver){

        String elementLocator = "";

        try{

            WebElement element = driver.findElement(By.id(elementLocator));
            element.click();

        }catch (Exception e){
            System.out.printf("\n\n An error has occurred, Message: "+e.getMessage()+"In the method: "+ ACTIONS.getMethodName());
        }

    }

}
