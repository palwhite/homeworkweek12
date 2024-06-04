package gov.uk.check.visa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectNationalityPage extends StartPage {

    public void selectNationality(By by,String nationality){
        WebElement nationalityDropDownList= driver.findElement(by);
        Select select=new Select(nationalityDropDownList);
        select.selectByValue(nationality);
    }

    public void clickNextStepButton(By by){
        WebElement nextStepButton= driver.findElement(by);
        nextStepButton.click();
    }
}
