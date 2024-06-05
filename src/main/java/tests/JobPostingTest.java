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
}
