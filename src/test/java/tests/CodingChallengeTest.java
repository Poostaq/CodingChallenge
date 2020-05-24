package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class CodingChallengeTest extends BaseTest {

    //region TEST DATA
    String URL = "https://www.qualityminds.de";
    String email = "hello@qualityminds.de";
    //endregion

    @Test
    @Description("Test Description: Verification of kontakt page using Top Menu and link on the bottom")
    public void testCase1(){
        commonsPage.goToURL(URL);
        homePage.goToKontaktTopMenu();
        kontaktPage.verifyEmail(email);
        String kontaktPageTitle = kontaktPage.getPageTitle();
        commonsPage.goToURL(URL);
        homePage.goToKontaktBottomArea();
        kontaktPage.verifyIfTheSamePage(kontaktPageTitle);
    }
}
