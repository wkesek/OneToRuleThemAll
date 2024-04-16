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

    int totalSum = 0;
    // Pobranie listy elementów
    WebElement listElement = driver.findElement(By.className( "css-2crog7" ));
    List<WebElement> visibleElements = driver.findElements( By.className( "css-2crog7" ) );
    WebElement lastElement = visibleElements.get(visibleElements.size() - 1);


    while (true) {
      // Pobranie wartości liczbowych z widocznych elementów
      for (WebElement element : visibleElements) {
        String elementText = element.getText();
        try {
          int elementValue = Integer.parseInt(elementText);
          totalSum += elementValue;
        } catch (NumberFormatException e) {
          // Pomiń element, jeśli nie zawiera liczby
        }
      }

      // Przescrollowanie listy o wysokość widocznej części
      js.executeScript("arguments[0].scrollIntoView(true)", lastElement);

      // Znalezienie nowych widocznych elementów
      visibleElements = listElement.findElements(By.className( "css-2crog7"));

      // Sprawdzenie, czy nie ma już nowych elementów
      if (visibleElements.isEmpty()) {
        break;
      }
    }

    return totalSum;
  }

}


