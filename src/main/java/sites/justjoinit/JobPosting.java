package sites.justjoinit;

import org.openqa.selenium.WebDriver;

public class JobPosting extends DefaultPage {

    public JobPosting(WebDriver driver) {
        super( driver ); //super - odwołuje się do konstruktora nadrzędnego
    }


    //weście do ogłoszenia przez clickElement
    //wyjście z ogłoszenia przez goBack

    public void getAddData(String addData){

    }



    /*

    public void openAllAds() {
        String listContainerSelector = "div[data-test-id='virtuoso-item-list']"; // Replace with your actual selector
        String listItemSelector = "[data-index]"; // Replace with your actual selector for list items
        WebElement listContainerElement = driver.findElement( By.cssSelector( listContainerSelector ) );

    } */
}
