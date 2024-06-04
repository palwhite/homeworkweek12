package gov.uk.check.visa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WorkTypePage  extends DurationOfStayPage {

    public void selectJobType(By by){
        WebElement selectJobtypeList= driver.findElement(by);
        selectJobtypeList.click();

    }

    public void clickNextStepButton(By by){
        WebElement nextStepButton= driver.findElement(by);
        nextStepButton.click();
    }
}
