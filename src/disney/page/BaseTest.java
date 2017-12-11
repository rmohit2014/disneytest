package disney.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;
    public BaseTest(){
        System.setProperty("webdriver.chrome.driver", "src/disney/drivers/chromedriver");
        this.driver = new ChromeDriver();
        getDriver().manage().window().maximize();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public void navigateUrl(String url){
        getDriver().get(url);
    }

    public void cleanup(){
        getDriver().close();
        getDriver().quit();
    }
}
