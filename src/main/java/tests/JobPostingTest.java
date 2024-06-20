package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import sites.justjoinit.JobPosting;

import java.util.List;

public class JobPostingTest extends DefaultTest {


    public void getAddData() {
        JobPosting jobPosting = new JobPosting( driver );

//        jobPosting.openAdd();
        jobPosting.getJobName();
        jobPosting.getCompanyName();
        jobPosting.getSalaryRange();
        jobPosting.getContractType();
        jobPosting.getWorkType();
        jobPosting.getOperatingMode();
        jobPosting.firstLocation();
        jobPosting.openDropdown();
        jobPosting.printLocations();
        jobPosting.openDropdown();
        jobPosting.getExperienceLevel();
        jobPosting.getTechStack();
        jobPosting.getLink();
        jobPosting.goBack();
    }

    @Test
    public void clickElementsWithDataIndex() {

        // Pobranie wszystkich elementów z atrybutem data-index
        List<WebElement> elements = driver.findElements( By.cssSelector( "[data-index]" ) );

        // Iteracja przez elementy i kliknięcie na każdy z nich zgodnie z rosnącymi indeksami
        for (int i = 0; i < elements.size(); i++) {
            WebElement element = driver.findElement( By.cssSelector( "[data-index='" + i + "']" ) );
            WebElement linkElement = element.findElement(By.tagName("a"));
            String url = linkElement.getAttribute("href");
            driver.navigate().to(url); //inne nazwy klas????!!!!
            getAddData();

            // Dodanie małej przerwy po każdym kliknięciu, aby uniknąć problemów z ładowaniem strony
            try {
                Thread.sleep( 500 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}