package sites.nofluffjobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NfjJobPosting extends NfjDefaultPage {

    public NfjJobPosting(WebDriver driver) {super(driver);}


        public void clickShowMore() {

            while (true) {
                try {
                    WebElement showMoreButton = driver.findElement(By.cssSelector("button[nfjloadmore]"));
                    if (showMoreButton.isDisplayed()) {
                        ((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView(); window.scrollBy(0, -100);", showMoreButton);
                        showMoreButton.click();


                        // Opcjonalne: dodaj krótki czas oczekiwania, aby uniknąć zbyt szybkiego klikania
                        Thread.sleep(500);
                    } else {
                        break; // Przerwij pętlę, jeśli przycisk nie jest widoczny
                    }
                } catch (Exception e) {
                    break; // Przerwij pętlę, jeśli przycisk nie istnieje lub nie jest widoczny
                }
            }
        }

        public void countJobs() {
            List<WebElement> allJobs = driver.findElements(By.tagName("a"));
            int allJobsCount = allJobs.size();
            System.out.println(allJobsCount);



        }
}

