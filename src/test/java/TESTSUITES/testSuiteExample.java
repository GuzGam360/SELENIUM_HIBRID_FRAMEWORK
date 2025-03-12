package TESTSUITES;

import BASE.Main;
import PAGES.ExamplePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testSuiteExample extends Main {

    static WebDriver driver;

    @Test (enabled = false, description = "dummy testCase, just an example")
    public void firstTest(){

        ExamplePage.clickOnButtonElement(driver);


    }

}
