package sites.justjoinit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.JobPostingTest;

import java.util.List;

public class TestRunner extends JobPostingTest {

    JobPostingTest jobPostingTest = new JobPostingTest();

    public void checkPostings() {
        List<WebElement> postings = driver.findElements( By.className( "css-1iq2gw3" ) );

        for (WebElement posting : postings) {
            if (posting.getAttribute("class").contains( "css-1iq2gw3" )) {
                jobPostingTest.getAddData();
            }
        }
    }
}
