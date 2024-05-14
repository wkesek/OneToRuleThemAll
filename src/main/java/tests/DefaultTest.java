package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class DefaultTest {

    protected WebDriver driver;




    @BeforeTest
    public void setUpTest () {
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Wojtek\\OneDrive\\Pulpit\\drivers\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 50, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.navigate().to( "https://justjoin.it/with-salary_yes" );
        driver.findElement( By.id( "cookiescript_accept" ) ).click();
        driver.findElement( By.cssSelector( "#__next > div.MuiBox-root.css-1v89lmg > div > div > div.MuiBox-root.css-4i8gwt > div.css-jn9ffp > div.MuiBox-root.css-1mzo6co > a:nth-child(11)" ) ).click();

    }


 //   @AfterTest
 //   public void teardown (){
 //          driver.quit();
  //        }
}
