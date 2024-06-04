package gov.uk.check.visa.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class ResultPage extends WorkTypePage {

    public void confirmResultMessage(By by,String expectedMessage){
        String resultMessage= driver.findElement(by).getText();
        Assertions.assertEquals(expectedMessage,resultMessage);
    }
    public String getResultMessage(){

        return "";
    }
}
