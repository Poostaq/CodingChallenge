package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import main.java.pages.CommonsPage;
import main.java.pages.HomePage;
import main.java.pages.KontaktPage;
import main.java.pages.PortfolioPage;

public class BaseTest {
    public WebDriver driver;
    public HomePage homePage;
    public CommonsPage commonsPage;
    public KontaktPage kontaktPage;
    public PortfolioPage portfolioPage;


    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void classLevelSetup() {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path+"\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void methodLevelSetup() {
        commonsPage = new CommonsPage(driver);
        homePage = new HomePage(driver);
        kontaktPage = new KontaktPage(driver);
        portfolioPage = new PortfolioPage(driver);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
