package tests;

import org.testng.annotations.Test;
import sites.nofluffjobs.NfjJobPosting;


@Test
public class NfjJobPostingTest extends NfjDefaultTest {

    public void extendList() {
        NfjJobPosting nfjJobPosting = new NfjJobPosting(driver);

        nfjJobPosting.clickShowMore();
        nfjJobPosting.countJobs();

    }


}
