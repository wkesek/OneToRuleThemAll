package sites.justjoinit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class DefaultPage {

    protected static WebDriver driver;

    public DefaultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements( this.driver, this );
    }

    protected void fillElement(WebElement element, String value) {
        element.clear();
        element.sendKeys( value );
    }

    protected void clickElement(WebElement element) {
        element.click();
    }

    protected void printValue(Integer value) {
        System.out.println( value );
    }

    protected void printText(String value) {
        System.out.println( value );
    }

    public void goBack(){
        driver.navigate().back();
    }
}




