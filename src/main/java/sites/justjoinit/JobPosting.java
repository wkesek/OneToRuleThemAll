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

    public String getSalaryRange(){
        WebElement salaryRange = driver.findElement( By.className( "css-1pavfqb" ) );
        String text = salaryRange.getText();
        System.out.println( text );
        return text;
    }

    public String getContractType(){
        WebElement contractType = driver.findElement( By.xpath( "//html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]" ) );
        String text = contractType.getText();
        System.out.println( text );
        return text;
    }

    public String getWorkType(){
        WebElement workType = driver.findElement( By.xpath( "//html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]" ) );
        String text = workType.getText();
        System.out.println( text );
        return text;
    }

    public String getOperatingMode(){
        WebElement operatingMode = driver.findElement( By.xpath( "//html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[4]/div[2]/div[2]" ) );
        String text = operatingMode.getText();
        System.out.println( text );
        return text;
    }

    public String getExperienceLevel(){
        WebElement experienceLevel = driver.findElement( By.xpath( "//html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]" ) );
        String text = experienceLevel.getText();
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
