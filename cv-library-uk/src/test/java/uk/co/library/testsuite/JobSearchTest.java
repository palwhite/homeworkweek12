package uk.co.library.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import uk.co.library.pages.ResultPage;
import uk.co.library.resources.testdata.TestData;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase  {

    @Test(dataProvider = "LoginData", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance,String salaryMin, String salaryMax, String sType, String jobType, String result){

        ResultPage rs=new ResultPage();
        enterJobTitle(By.cssSelector("input#keywords"),jobTitle);
        enterLocation(By.xpath("//input[@id='location']"),location);
        selectDistance(By.id("distance"),distance);
        clickOnMoreSearchOptionLink(By.cssSelector("button#toggle-hp-search"));
        enterMinSalary(By.id("salarymin"),salaryMin);
        enterMaxSalary(By.id("salarymax"),salaryMax);
        selectSalaryType(By.id("salarytype"),sType);
        selectJobType(By.id("tempperm"),jobType);
        clickOnFindJobsButton(By.id("hp-search-btn"));
        rs.verifyTheResults(By.xpath("//div/h1[@class='search-header__title']"),result);
    }
}
