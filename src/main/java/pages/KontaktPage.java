package main.java.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class KontaktPage extends BasePage{

    //region CONSTRUCTOR
    public KontaktPage(WebDriver driver) {
        super(driver);
    }
    //endregion

    //region LOCATORS
    By email = By.xpath("//div[@class=\"et_pb_text_inner\"]/p/span/a");
    By title = By.xpath("/html/head/title");
    //endregion

    //region VERIFICATIONS
    @Step("Verify if the page contains email address: {0}")
    public KontaktPage verifyEmail(String expectedMail) {
        //waitVisibility(email);
        Assert.assertEquals(readText(email), expectedMail);
        return this;
    }

    @Step("Verify if the page displayed in step 2 is the same page that is displayed in step 5")
    public void verifyIfTheSamePage(String expectedTitle){
        //waitVisibility(title);
        Assert.assertEquals(readText(title), expectedTitle);
    }
    //endregion

    //region ACTIONS
    @Step("Save title of page for verification.")
    public String getPageTitle(){
        return driver.findElement(title).getText();
    }
    //endregion
}
