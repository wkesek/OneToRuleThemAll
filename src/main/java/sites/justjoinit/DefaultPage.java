package sites.justjoinit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public abstract class DefaultPage {

    protected static WebDriver driver;

    public DefaultPage(WebDriver driver) {
        DefaultPage.driver = driver;
        PageFactory.initElements(DefaultPage.driver, this );
    }

    protected void fillElement(WebElement element, String value) {
        element.clear();
        element.sendKeys( value );
    }

    public void clickElement(WebElement element) {
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




