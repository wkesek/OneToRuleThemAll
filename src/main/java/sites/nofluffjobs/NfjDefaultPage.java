package sites.nofluffjobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class NfjDefaultPage {
    protected static WebDriver driver;

    public NfjDefaultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    protected void printValue(Integer value) {
        System.out.println( value );
    }
}