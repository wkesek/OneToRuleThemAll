package tests;

import org.testng.annotations.Test;
import sites.justjoinit.JobPosting;

public class JobPostingTest extends DefaultTest{

    @Test
    public void getAddData() {
        JobPosting jobPosting = new JobPosting (driver);

        jobPosting.openAdd();
        jobPosting.getJobName();
        jobPosting.getCompanyName();
        jobPosting.goBack();
        ;
    }
}
