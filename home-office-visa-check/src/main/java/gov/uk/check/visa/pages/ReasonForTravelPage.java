package gov.uk.check.visa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReasonForTravelPage extends SelectNationalityPage {

    public void selectReasonForVisit(By by){
        WebElement reasonForVisitList= driver.findElement(by);
        reasonForVisitList.click();
    }

    public void clickNextStepButton(By by){
        WebElement nextStepButton=driver.findElement(by);
        nextStepButton.click();
    }
}
