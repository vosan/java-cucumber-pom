package javacucumberpom.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CucumberHooks {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.walmart.com/");
    }

    @After
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
