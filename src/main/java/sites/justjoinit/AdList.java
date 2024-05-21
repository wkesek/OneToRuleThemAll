package sites.justjoinit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AdList extends DefaultPage {



  WebDriverWait wait = new WebDriverWait( driver, 10 );
  JavascriptExecutor js = (JavascriptExecutor) driver;

    public AdList(WebDriver driver) {
      super( driver ); //super - odwołuje się do konstruktora nadrzędnego
    }


  public void scrollToBottom() {
    WebElement footer = driver.findElement( By.className( "css-gstxgp" ) );
    ((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView();", footer );
  }

  public int countAds() {
    // Locate the list container element
    String listContainerSelector = "div[data-test-id='virtuoso-item-list']"; // Replace with your actual selector
    String listItemSelector = "[data-index]"; // Replace with your actual selector for list items
    WebElement listContainerElement = driver.findElement( By.cssSelector( listContainerSelector ) );


    // Initialize variables to track the highest index and element
    int highestIndex = -1;
    WebElement highestIndexElement = null;

    // Iterate through list items and find the highest index
    for (WebElement listItem : listContainerElement.findElements( By.cssSelector( listItemSelector ) )) {
      String indexString = listItem.getAttribute( "data-index" ); // Assuming elements have a data-index attribute
      int index = Integer.parseInt( indexString );

      if (index > highestIndex) {
        highestIndex = index;
        highestIndexElement = listItem;

      }
    }
    return highestIndex;
  }

public void printNumber() {
  printValue(countAds());
  }
}

