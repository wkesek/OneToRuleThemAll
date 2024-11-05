package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import sites.justjoinit.JobPosting;

import java.util.List;


public class JobPostingTest extends DefaultTest {


    public int countAds() {
        // Locate the list container element
        //     WebElement footer = driver.findElement( By.className( "css-gstxgp" ) );
        //    ((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView();", footer );
        String listContainerSelector = "div[data-test-id='virtuoso-item-list']";
        String listItemSelector = "[data-index]";
        WebElement listContainerElement = driver.findElement(By.cssSelector(listContainerSelector));


        // Initialize variables to track the highest index and element
        int highestIndex = -1;
        WebElement highestIndexElement = null;

        // Iterate through list items and find the highest index
        for (WebElement listItem : listContainerElement.findElements(By.cssSelector(listItemSelector))) {
            String indexString = listItem.getAttribute("data-index"); // Assuming elements have a data-index attribute
            int index = Integer.parseInt(indexString);

            if (index > highestIndex) {
                highestIndex = index;
                highestIndexElement = listItem;

            }
        }
        return highestIndex;
    }


    public void getAddData() {
        JobPosting jobPosting = new JobPosting(driver);

//        jobPosting.openAdd();
        jobPosting.getJobName();
        jobPosting.getCompanyName();
/*        jobPosting.getSalaryRange();
        jobPosting.getContractType();
        jobPosting.getWorkType();
        jobPosting.getOperatingMode();
        jobPosting.getExperienceLevel();
        jobPosting.firstLocation();
        jobPosting.openDropdown();
        jobPosting.printLocations();
        jobPosting.openDropdown();
        jobPosting.getTechStack();*/
        jobPosting.getLink();
        driver.navigate().back();
    }

    @Test
    public void clickElementsWithDataIndex() {

// Pobranie wszystkich elementów z atrybutem data-index
//        List<WebElement> elements = driver.findElements( By.cssSelector( "[data-index]" ) );
//        int numberOfElements = countAds();
        int index = 0;
        while (true) {

            try {
                // Znalezienie elementu z aktualnym indeksem
                WebElement element = driver.findElement(By.cssSelector("[data-index='" + index + "']"));
                if (index % 17 == 0) {

                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                    //              WebElement elementToGo = driver.findElement( By.cssSelector( "[data-index='" + i + "']" ) );
                    WebElement linkElement = element.findElement(By.tagName("a"));
                    String url = linkElement.getAttribute("href");
                    driver.navigate().to(url);
                    getAddData();

                // Dodanie małej przerwy po każdym kliknięciu, aby uniknąć problemów z ładowaniem strony
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();



                }
                index++;
            } catch (NoSuchElementException e) {
                // Jeśli nie ma więcej elementów, zakończ pętlę
                break;

            }

        }
    }
}