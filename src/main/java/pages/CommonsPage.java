package main.java.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CommonsPage extends BasePage {

    public CommonsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Go to {0} URL.")
    public void goToURL(String baseURL) {
        driver.get(baseURL);
    }
}
