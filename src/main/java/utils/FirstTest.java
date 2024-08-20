package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest{
    @Test
    public void FirstTestMethod() {

        WebElement linkElement = driver.findElement( By.tagName( "a" ) );
        // Get the value of the href attribute
        String actualHrefValue = linkElement.getAttribute( "href" );
        // Define the expected href value
        String expectedHrefValue = "https://justjoin.it/";
        // Assert that the actual href value matches the expected href value
        Assert.assertEquals( actualHrefValue, expectedHrefValue, "Href value mismatch" );
        Assert.assertEquals( actualHrefValue, expectedHrefValue, "Header mismatch" );
    }

    private WebDriver driver;

    @BeforeMethod

    public void setUp (){
<<<<<<< HEAD
        System.setProperty( "webdriver.chrome.driver", "D:\\Projekty\\Drivers\\chromedriver-win64\\chromedriver.exe");
=======
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Wojtek\\OneDrive\\Pulpit\\drivers\\chromedriver-win64New\\chromedriver.exe");
>>>>>>> a55e7a43876fab04b7a87bbefc57f55c16cf5d40
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 50, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.navigate().to( "https://justjoin.it/" );
    }

    @Test
    public void filteringAds (){
        driver.findElement( By.cssSelector( "#__next > div.MuiBox-root.css-1v89lmg > div.css-c4vap3 > div > div.MuiBox-root.css-4i8gwt > div.css-jn9ffp > div.MuiBox-root.css-1mzo6co > a:nth-child(11) > div.MuiAvatar-root.MuiAvatar-circular.MuiAvatar-colorDefault.css-50eul5" ) ).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[1]/div[2]/div/div/div[1]/div[1]/div/div/button[1]")).click();
    }


  //  @AfterMethod
 //           public void teardown (){
 //   driver.quit();
  //  }

}