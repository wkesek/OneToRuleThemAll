package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeOptions;
=======
>>>>>>> a55e7a43876fab04b7a87bbefc57f55c16cf5d40
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class DefaultTest {

    protected WebDriver driver;

<<<<<<< HEAD
    chrome_options = Options()
chrome_options.add_argument("--disable-search-engine-choice-screen")
    self.driver = webdriver.Chrome(options=chrome_options, service=self.s)

    @BeforeTest
    public void setUpTest () {
        System.setProperty( "webdriver.chrome.driver", "D:\\Projekty\\Drivers\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement( By.className("1")).click();
=======

    @BeforeTest
    public void setUpTest () {
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Wojtek\\OneDrive\\Pulpit\\drivers\\chromedriver-win64New\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 50, TimeUnit.SECONDS);
        driver.manage().window().maximize();

>>>>>>> a55e7a43876fab04b7a87bbefc57f55c16cf5d40
        driver.navigate().to( "https://justjoin.it/all-locations/testing/with-salary_yes" );
        driver.findElement( By.id( "cookiescript_accept" ) ).click();

    }



/*
    @AfterTest
    public void teardown (){
           driver.quit();
          } */
}
