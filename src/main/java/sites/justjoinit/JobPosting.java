package sites.justjoinit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JobPosting extends DefaultPage {


    public JobPosting(WebDriver driver) {
        super( driver ); //super - odwołuje się do konstruktora nadrzędnego
    }

/*    //Ogłoszenie na sztywno narazie
    @FindBy(className = "css-1iq2gw3")
    public WebElement testAdd;

    //weście do ogłoszenia przez clickElement
    //wyjście z ogłoszenia przez goBack

    public void openAdd() {
        clickElement( testAdd );
    }
*/
    public String getJobName() {
        WebElement jobName = driver.findElement( By.tagName( "h1" ) );
        String text = jobName.getText();
        System.out.println( text );
        return text;
    }

    public String getCompanyName(){
        WebElement companyName = driver.findElement( By.xpath( "//*[@id=\"__next\"]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]" ) );
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
        WebElement contractType = driver.findElement( By.xpath( "/html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]" ) );
        String text = contractType.getText();
        System.out.println( text );
        return text;
    }

    public String getWorkType(){
        WebElement workType = driver.findElement( By.xpath( "/html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]" ) );
        String text = workType.getText();
        System.out.println( text );
        return text;
    }

    public String getOperatingMode(){
        WebElement operatingMode = driver.findElement( By.xpath( "/html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/div[2]" ) );
        String text = operatingMode.getText();
        System.out.println( text );
        return text;
    }

    public String getExperienceLevel(){
        WebElement experienceLevel = driver.findElement( By.xpath( "/html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]" ) );
        String text = experienceLevel.getText();
        System.out.println( text );
        return text;
    }

    public void openDropdown() {
        WebElement locationDropdown = driver.findElement(By.xpath( "/html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]" ));
        clickElement( locationDropdown );
    }
//OGARNĄĆ UNIVERSALNĄ METODĘ NA LOKACJĘ, CZĘŚĆ MA TYLKO JEDNĄ I NIE MA BUTTONA.PEWNIE IF-em
    public void firstLocation(){
        WebElement location1 = driver.findElement( By.xpath( "/html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]" ) );
        String location = location1.getText();
        System.out.println(location);
    }

    public void printLocations(){
        List<WebElement> location = driver.findElements( By.cssSelector("span.css-1si1hfj"));
            for (WebElement element : location) {
                    String miasto = element.getText();
                    System.out.println(miasto );
                }
            }

    public void getTechStack() {
        List<WebElement> stackList = driver.findElements(By.tagName("h4"));
        for (WebElement techItem : stackList) {
            String technology = techItem.getText();
            System.out.println(technology);
        }
    }

    public String getLink(){
        String link = driver.getCurrentUrl();
        System.out.println(link);
        return link;
    }
}


