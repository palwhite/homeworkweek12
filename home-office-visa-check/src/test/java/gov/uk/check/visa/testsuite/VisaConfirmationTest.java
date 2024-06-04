package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

    @Test(priority = 3)
    public void anAustralianCominToUKForTourism(){
        clickStartNow(By.xpath("//section/a"));
        selectNationality(By.cssSelector("select#response"),"australia");
        clickNextStepButton(By.xpath("//button[text()='Continue']"));
        selectReasonForVisit(By.cssSelector("input#response-0"));
        clickNextStepButton(By.xpath("//button[text()='Continue']"));
        confirmResultMessage(By.xpath("//main/div/div[1]/div/div/h2"),"You will not need a visa to come to the UK");

    }

    @Test(priority = 1)
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){
        clickStartNow(By.xpath("//section/a"));
        selectNationality(By.cssSelector("select#response"),"chile");
        clickNextStepButton(By.xpath("//button[text()='Continue']"));
        selectReasonForVisit(By.cssSelector("input#response-1"));
        clickNextStepButton(By.xpath("//button[text()='Continue']"));
        selectLengthOfStay(By.cssSelector("input#response-1"),"More");
        clickNextStepButton(By.xpath("//button[text()='Continue']"));
        selectJobType(By.cssSelector("input#response-0"));
        clickNextStepButton(By.xpath("//button[text()='Continue']"));
        confirmResultMessage(By.xpath("//main/div/div[1]/div/div/h2"),"You need a visa to work in health and care");
    }

    @Test(priority = 2)
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        clickStartNow(By.xpath("//section/a"));
        selectNationality(By.cssSelector("select#response"),"colombia");
        clickNextStepButton(By.xpath("//button[text()='Continue']"));
        selectReasonForVisit(By.cssSelector("input#response-4"));
        clickNextStepButton(By.xpath("//button[text()='Continue']"));
    }
}
