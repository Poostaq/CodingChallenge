package main.java.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class PortfolioPage extends BasePage {

    //region CONSTRUCTOR
    public PortfolioPage(WebDriver driver) {
        super(driver);
    }
    //endregion

    //region LOCATORS
    By mobileTab = By.xpath("//div[@id=\"et-boc\"][3]//div[text()=\"Mobile\"][@class=\"sb_mod_acf_single_item clearfix\"]");
    By flyerDownloadButton = By.xpath("//a[text()=\"Flyer Find the Bug Session\"]");
    String hrefForDownload = "https://qualityminds.de/app/uploads/2018/11/Find-The-Mobile-Bug-Session.pdf";
    //endregion

    //region VERIFICATIONS
    @Step("Verify the download link for the flyer")
    public void verifyDownloadLinkFlyer(){
        Assert.assertEquals(driver.findElement(flyerDownloadButton).getAttribute("href"), hrefForDownload);
    }
    //endregion

    //region ACTIONS
    @Step("Click on Mobile tab in “Web – Automatisierung – Mobile” section")
    public void clickMobileTab(){
        click(mobileTab);
    }

    @Step("Verify if file is available via download link")
    public void downloadFile(){
        click(flyerDownloadButton);
    }
    //endregion
}
