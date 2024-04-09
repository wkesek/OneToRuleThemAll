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


  WebDriverWait wait = new WebDriverWait( driver, 5 );
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


  public int countAds() {

    // Pobranie listy elementów
    List<WebElement> ads = driver.findElements( By.className( "css-2crog7" ) );
    WebElement lastItem = ads.get(ads.size() - 1);

    js.executeScript("arguments[0].scrollIntoView(true);", lastItem);
    //zwróć liczbę ogłoszeń
  int adsCount = ads.size();
 return adsCount;

  }

}


