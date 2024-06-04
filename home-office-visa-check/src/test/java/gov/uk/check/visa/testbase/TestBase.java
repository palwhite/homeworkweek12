package gov.uk.check.visa.testbase;

import gov.uk.check.visa.pages.ResultPage;
import gov.uk.check.visa.propertyreader.PropertyReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;

public class TestBase extends ResultPage {

    public String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod (alwaysRun = true)
    public void setupTest() {
        selectBrowser(browser);
    }

   @Ignore
   @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

}
