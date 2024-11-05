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
                    WebElement showMoreButton = driver.findElement(By.cssSelector("body > nfj-root > nfj-layout > nfj-main-content > div > nfj-postings-search > div > div.tw-mb-5.tw-mt-3.lg\\:tw-mt-6.container > div > div > common-main-loader > div > nfj-search-results > div.tw-flex.tw-flex-wrap.tw-justify-center.tw-mt-1\\.5.tw-mb-8.tw-gap-4 > button"));
                    if (showMoreButton.isDisplayed()) {
                        ((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView();", showMoreButton);
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

