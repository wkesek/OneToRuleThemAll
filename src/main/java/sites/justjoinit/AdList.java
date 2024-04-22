package sites.justjoinit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class AdList extends DefaultPage {

  @FindBy(id = "cookiescript_accept")
  private WebElement acceptCookies;

  @FindBy(css = "#__next > div.MuiBox-root.css-1v89lmg > div > div > div.MuiBox-root.css-4i8gwt > div.css-jn9ffp > div.MuiBox-root.css-1mzo6co > a:nth-child(11)")
  private WebElement testsFilter;

  @FindBy(css = "#mui-p-16968-T-salaryOnly")
  private WebElement withSalaryFilter;

//  @FindBy(  = "#__next > div.MuiBox-root.css-1v89lmg > div.css-c4vap3 > div > div.MuiBox-root.css-1fmajlu > div > div > div:nth-child(3) > div > div:nth-child(2)")
//  private WebElement listElement;

  WebDriverWait wait = new WebDriverWait( driver, 10 );
  JavascriptExecutor js = (JavascriptExecutor) driver;

  public AdList(WebDriver driver) {
    super( driver ); //super - odwołuje się do konstruktora nadrzędnego
  }

  public void cookiesClick() {
    wait.until( ExpectedConditions.elementToBeClickable( acceptCookies ) );
    clickElement( acceptCookies );
  }

  public void testsClick() {
    wait.until( ExpectedConditions.elementToBeClickable( testsFilter ) );
    clickElement( testsFilter );
  }


  public void countAds() {
    ((JavascriptExecutor) driver).executeScript( "window.scrollTo(0, document.body.scrollHeight)" );//wrzucić do DefaultPage ale naprawić skrollowanie powrotne
    List<WebElement> adsList = driver.findElements( By.className( "css-2crog7" ));
    int index = 1;

    for (WebElement element : adsList) {
      System.out.println("Index: " + index + ", Element: " + element.getText());
      index++;
    }
  }
}

//    return highestIndexElement;

