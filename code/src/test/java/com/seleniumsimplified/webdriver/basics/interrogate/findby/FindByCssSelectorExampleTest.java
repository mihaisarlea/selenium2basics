package com.seleniumsimplified.webdriver.basics.interrogate.findby;

import com.seleniumsimplified.webdriver.manager.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindByCssSelectorExampleTest {

    static WebDriver driver;

    @BeforeClass
    public static void createDriverAndVisitTestPage(){
        //driver = new FirefoxDriver();
        driver = Driver.get("http://www.compendiumdev.co.uk" +
                "/selenium/find_by_playground.php");
    }

    @Test
    public void findByIdUsingCSSId(){

        WebElement element;
        element = driver.findElement(
                By.cssSelector("#p3"));

        assertEquals("expected a match on id",
                "This is c paragraph text",
                element.getText());
    }

    @Test
    public void findElementsUsingCSSTag(){

        List<WebElement> elements;
        elements = driver.findElements(
                        By.cssSelector("p"));

        assertEquals("expected a different number",
                        41,
                        elements.size());
    }

    @AfterClass
    public static void closeBrowser(){
        //driver.quit();
    }
}
