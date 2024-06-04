package gov.uk.check.visa.pages;

import gov.uk.check.visa.driverfactory.ManageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartPage extends ManageDriver {

        public void clickStartNow(By by){
            WebElement startNowButton= driver.findElement(by);
            startNowButton.click();
        }
}
