package sites.justjoinit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobPosting extends DefaultPage {

    public JobPosting(WebDriver driver) {
        super( driver ); //super - odwołuje się do konstruktora nadrzędnego
    }

    //Ogłoszenie na sztywno narazie
    @FindBy(className = "css-2crog7")
    private WebElement testAdd;

    //weście do ogłoszenia przez clickElement
    //wyjście z ogłoszenia przez goBack

    public void openAdd() {
        clickElement( testAdd );
    }

    public String getJobName() {
        WebElement jobName = driver.findElement( By.cssSelector( "h1.css-370yn4" ) );
        String text = jobName.getText();
        System.out.println( text );
        return text;
    }

    public String getCompanyName(){
        WebElement companyName = driver.findElement( By.className( "css-mbkv7r" ) );
        String text = companyName.getText();
        System.out.println( text );
        return text;
    }
}


    /*

    public void openAllAds() {
        String listContainerSelector = "div[data-test-id='virtuoso-item-list']"; // Replace with your actual selector
        String listItemSelector = "[data-index]"; // Replace with your actual selector for list items
        WebElement listContainerElement = driver.findElement( By.cssSelector( listContainerSelector ) );

    } */
