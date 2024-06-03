package uk.co.library.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import uk.co.library.driverfactory.ManageDriver;

public class HomePage extends ManageDriver {


        public void enterJobTitle(By by,String jobTitle){

            WebElement jobTitleelement= driver.findElement(by);
            jobTitleelement.sendKeys(jobTitle);
        }

        public void enterLocation(By by,String location){
            WebElement locationelement= driver.findElement(by);
            locationelement.sendKeys(location);
        }

        public void selectDistance(By by,String distance){
            WebElement distanceDropDown= driver.findElement(by);
            Select select=new Select(distanceDropDown);
            select.selectByVisibleText(distance);
        }

        public void clickOnMoreSearchOptionLink(By by){
            WebElement moreSearchOptionsLink= driver.findElement(by);
            moreSearchOptionsLink.click();
        }

        public void enterMaxSalary(By by,String minSalary){
             WebElement salaryMin=driver.findElement(by);
             salaryMin.sendKeys(minSalary);
        }

        public void enterMinSalary(By by,String maxSalary){
             WebElement salaryMax=driver.findElement(by);
            salaryMax.sendKeys(maxSalary);
        }

         public void selectSalaryType(By by,String sType){
            WebElement salaryTypeDropDown= driver.findElement(by);
            Select select=new Select(salaryTypeDropDown);
            select.selectByVisibleText(sType);
         }

         public void selectJobType(By by,String jobType){
          WebElement jobTypeDropDown= driver.findElement(by);
            Select select=new Select(jobTypeDropDown);
            select.selectByValue(jobType);
        }

         public void clickOnFindJobsButton(By by){
            WebElement findJobsBtn= driver.findElement(by);
             findJobsBtn.click();
        }
}
