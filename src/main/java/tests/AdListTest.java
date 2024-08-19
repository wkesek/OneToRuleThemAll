package tests;

import org.testng.annotations.Test;
import sites.justjoinit.AdList;


public class AdListTest extends DefaultTest {

    @Test
    public void numberOfAds() {
        //filtruje ogłoszenia

        AdList adList = new AdList( driver );
        adList.scrollToBottom();
        adList.countAds();
        adList.printNumber();

        }
}
