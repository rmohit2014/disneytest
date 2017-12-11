package disney.tests;

import disney.page.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BasicTest {

    HomePage homePage;

    @Test(description = "Verify the first Menu Title is Parks & Tickets")
    public void verifyFirstMenuTitle() throws InterruptedException {

        homePage = new HomePage();
        homePage.goToHomePage();
        Assert.assertEquals(homePage.getFirstMenuItem(), "Parks & Tickets", "The menu title does not matched");
    }

    @AfterMethod
    public void tearDown(){
        homePage.cleanup();
    }

}
