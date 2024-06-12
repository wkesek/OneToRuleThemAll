package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import sites.justjoinit.JobPosting;

public class JobPostingTest extends DefaultTest {


    public void getAddData() {
        JobPosting jobPosting = new JobPosting( driver );

        jobPosting.openAdd();
        jobPosting.getJobName();
        jobPosting.getCompanyName();
        jobPosting.getSalaryRange();
        jobPosting.getContractType();
        jobPosting.getWorkType();
        jobPosting.getOperatingMode();
        jobPosting.firstLocation();
        jobPosting.openDropdown();
        jobPosting.printLocations();
        jobPosting.getExperienceLevel();
        jobPosting.getTechStack();
        jobPosting.getLink();
        jobPosting.goBack();
    }

    @Test
    public void checkPostings() {

        // Locate the list container element
        String listContainerSelector = "div[data-test-id='virtuoso-item-list']";
        String listItemSelector = "[data-index]";
        WebElement listContainerElement = driver.findElement( By.cssSelector( listContainerSelector ) );


        // Wygląda na to, ze nie może go kliknąc

        for (WebElement listItem : listContainerElement.findElements( By.cssSelector( listItemSelector ) )) {
            getAddData();
        }
    }
}