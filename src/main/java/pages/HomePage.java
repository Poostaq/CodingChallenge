package main.java.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    //region LOCATORS
    By kontaktTopMenu = By.id("menu-item-66");
    By kontaktBottomMenu = By.id("menu-item-747");
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
    //endregion
}
