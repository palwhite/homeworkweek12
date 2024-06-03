package uk.co.library.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import uk.co.library.pages.HomePage;
import uk.co.library.propertyreader.PropertyReader;

public class TestBase extends HomePage {

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
