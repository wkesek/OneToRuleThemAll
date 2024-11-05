package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class NfjDefaultTest {

    protected WebDriver driver;


    @BeforeTest
    public void setUpTest () {
        System.setProperty( "webdriver.chrome.driver", "D:\\Projekty\\Drivers\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait( 50, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.navigate().to( "https://nofluffjobs.pl/testing" );
        driver.findElement( By.id( "onetrust-accept-btn-handler" ) ).click();

    }
}
