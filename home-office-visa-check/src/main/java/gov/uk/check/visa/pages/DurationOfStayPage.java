package gov.uk.check.visa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DurationOfStayPage extends ReasonForTravelPage {

    public void clickNextStepButton(By by){
        WebElement nextStepButton=driver.findElement(by);
        nextStepButton.click();
    }

    public void selectLengthOfStay(By by,String moreOrLess){

        switch (moreOrLess){
            case "More":
                WebElement moreThanSixMonths= driver.findElement(by);
                moreThanSixMonths.click();
                break;
            case "Less":
                WebElement lessThanSixMonths= driver.findElement(by);
                lessThanSixMonths.click();
                break;

            default:
                lessThanSixMonths= driver.findElement(by);
                lessThanSixMonths.click();
                break;
        }


    }
}
