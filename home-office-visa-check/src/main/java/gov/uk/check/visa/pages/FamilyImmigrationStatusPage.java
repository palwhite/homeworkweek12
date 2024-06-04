package gov.uk.check.visa.pages;

import gov.uk.check.visa.driverfactory.ManageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FamilyImmigrationStatusPage extends ManageDriver {

    public void clickNextStepButton(By by){
        WebElement nextStepButton=driver.findElement(by);
        nextStepButton.click();
    }

    public void selectImmigrationStatus(By by,String status){
        WebElement yes= driver.findElement(by);
        WebElement no= driver.findElement(by);
        
    }
}
