package uk.co.library.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultPage extends HomePage{

    public void verifyTheResults(By by,String expected){
        WebElement resultText= driver.findElement(by);
        String actualtext=resultText.getText();
        System.out.println(actualtext);
        Assertions.assertEquals(actualtext,expected);
    }
}
