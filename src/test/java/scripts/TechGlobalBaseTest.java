package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.TechGlobalBasePage;
import pages.TechGlobalFrontendHomePage;
import pages.TechGlobalFrontendTestingPage;
import pages.TechGlobalLoginFormPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TechGlobalBaseTest {

    WebDriver driver;

    TechGlobalBasePage techGlobalBasePage;

    TechGlobalFrontendHomePage techGlobalFrontendHomePage;

    TechGlobalLoginPageTest techGlobalLoginPageTest;

    TechGlobalLoginFormPage techGlobalLoginFormPage;
   TechGlobalFrontendTestingPage techGlobalFrontendTestingPage;

    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("url"));

        techGlobalBasePage = new TechGlobalBasePage();


    }

    @AfterMethod
    public void tearDown() {

        Driver.quitDriver();


    }


}
