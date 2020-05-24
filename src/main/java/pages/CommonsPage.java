package main.java.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CommonsPage extends BasePage {

    public CommonsPage(WebDriver driver) {
        super(driver);
    }

    //region VERIFICATIONS
    @Step("Verify that the {0} item of the top bar menu is highlighted.")
    public void verifyTopMenuHighlighted(String topMenuItem){
        By portfolioTopMenu = By.xpath("//ul[@id=\"top-menu\"]/li[contains(@class,'current-menu-ancestor')]/a[text()=\""+topMenuItem+"\"]");
        System.out.println(driver.findElements(portfolioTopMenu).size() > 0);
        Assert.assertTrue(driver.findElements(portfolioTopMenu).size() > 0);
    }
    //endregion

    //region ACTIONS
    @Step("Go to {0} URL.")
    public void goToURL(String baseURL) {
        driver.get(baseURL);
    }
    //endregion
}
