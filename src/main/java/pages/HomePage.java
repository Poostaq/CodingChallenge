package main.java.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    //region LOCATORS
    By kontaktTopMenu = By.id("menu-item-66");
    By kontaktBottomMenu = By.id("menu-item-747");
    By portfolioTopMenu = By.xpath("//ul[@id=\"top-menu\"]/li/a[text()=\"Portfolio\"]");
    //endregion

    //region VERIFICATIONS
    //endregion

    //region ACTIONS
    @Step("Click on 'Kontakt' at the top navigatiuon bar of the page.")
    public void goToKontaktTopMenu(){
        click(kontaktTopMenu);
    }

    @Step("Click on 'Kontakt' at the top navigatiuon bar of the page.")
    public void goToKontaktBottomArea(){
        click(kontaktBottomMenu);
    }

    @Step("Hover on Portfolio at the top navigation bar of the page and verify if submenu is displayed")
    public void hoverToPortfolioTopMenu(){
        Actions actions = new Actions(driver);
        WebElement topMenu = driver.findElement(portfolioTopMenu);
        actions.moveToElement(topMenu).perform();
    }

    @Step("Click on {0} sub option ")
    public void clickOnTopMenuSubitem(String subitemText){
        By subitem = By.xpath("//ul[@id=\"top-menu\"]//li/a[text()=\""+subitemText+"\"]");
        click(subitem);
    }
    //endregion
}
