package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class DefaultTest {

    protected WebDriver driver;


    @BeforeTest
    public void setUpTest () {
        System.setProperty( "webdriver.chrome.driver", "D:\\Projekty\\Drivers\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait( 50, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.navigate().to( "https://justjoin.it/all-locations/testing/with-salary_yes" );
        driver.findElement( By.id( "cookiescript_accept" ) ).click();

    }



/*
    @AfterTest
    public void teardown (){
           driver.quit();
          } */
}
