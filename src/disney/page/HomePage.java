package disney.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BaseTest {
    public HomePage(){
        PageFactory.initElements(this.getDriver(), this);
    }

    String URL = "https://disneyland.disney.go.com/";

    @FindBy(css = ".titleHolder.ng-binding")
    private List<WebElement> menuItems;

    public String getFirstMenuItem(){
        new WebDriverWait(this.getDriver(), 10).until(ExpectedConditions.visibilityOf(menuItems.get(0)));
        return menuItems.get(0).getText();
    }

    public void goToHomePage(){
        navigateUrl(URL);
    }


}
