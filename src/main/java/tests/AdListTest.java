package tests;

import org.testng.annotations.Test;
import sites.justjoinit.AdList;


public class AdListTest extends DefaultTest {

    @Test
    public void numberOfAds() {
        //filtruje ogłoszenia

        AdList adList = new AdList( driver );
        adList.cookiesClick();
//        adList.salaryFilterClick();
        adList.testsClick();
        adList.scrollToBottom();
        adList.countAds();
        adList.printNumber();

//        int expectedCount = 22;
//        Assert.assertEquals( adList.countAds(), expectedCount );
//        System.out.println( "Znalozem " + adList.countAds() + " ogłoszeń" );
        }
}
