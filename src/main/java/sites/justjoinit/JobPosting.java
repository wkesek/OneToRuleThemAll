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
    @FindBy(xpath = "//html/body/div[1]/div[3]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div")
    private WebElement testAdd;

    //weście do ogłoszenia przez clickElement
    //wyjście z ogłoszenia przez goBack

    public void openAdd (){
        clickElement( testAdd );
    }

    public void getJobName(){
       WebElement addNaming = driver.findElement( By.id( "h1" ));
       String jobName =addNaming.getAttribute( "css-370yn4" );
        System.out.println(jobName);
    }



    /*

    public void openAllAds() {
        String listContainerSelector = "div[data-test-id='virtuoso-item-list']"; // Replace with your actual selector
        String listItemSelector = "[data-index]"; // Replace with your actual selector for list items
        WebElement listContainerElement = driver.findElement( By.cssSelector( listContainerSelector ) );

    } */
}
