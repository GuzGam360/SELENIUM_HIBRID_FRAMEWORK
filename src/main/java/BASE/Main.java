package BASE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import javax.swing.*;

public class Main {

    static WebDriver driver = null;

    public static void main(String[] args) {

        //Here you Set Up the URL that want to test, is not recommended to do it like this, in future updates will be revamped
        setUp("");
        

    }

    /***
     * This Method is what the test going to do before execute the TestCase
     *
     * @param url The URL you want to test, this way isn't the best practice it will be revamped
     */
    @BeforeMethod
    public static void setUp(String url){

        String navigator = JOptionPane.showInputDialog("Please select an type one these navigators to execute the tests: \n\nchrome\nedge\nfirefox\nopera");
        System.out.println("El WebDriver Seleccionado Fue: "+navigator);

        switch (navigator.toLowerCase()){
            case "chrome":

                driver = new ChromeDriver();

                break;
            case "edge":

                driver = new EdgeDriver();

                break;
            case "firefox":

                driver = new FirefoxDriver();

                break;
            case "opera":

                driver = new OperaDriver();

                break;
            default:

                driver = new ChromeDriver();

                break;
        }

        driver.get(url);
    }

    @AfterMethod
    public static void tearDown(){
        //driver.close(); <- solo cierra la ventana en curso
        driver.quit(); //<- cierra todas la instancias de WebDriver abiertas
    }
}