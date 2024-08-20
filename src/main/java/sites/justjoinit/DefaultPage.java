package sites.justjoinit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
=======
>>>>>>> a55e7a43876fab04b7a87bbefc57f55c16cf5d40
import org.openqa.selenium.support.PageFactory;

public abstract class DefaultPage {

    protected static WebDriver driver;

    public DefaultPage(WebDriver driver) {
<<<<<<< HEAD
        DefaultPage.driver = driver;
        PageFactory.initElements(DefaultPage.driver, this );
=======
        this.driver = driver;
        PageFactory.initElements( this.driver, this );
>>>>>>> a55e7a43876fab04b7a87bbefc57f55c16cf5d40
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




