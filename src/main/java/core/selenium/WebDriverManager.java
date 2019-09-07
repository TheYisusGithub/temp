package core.selenium;

import core.selenium.webdrivers.Chrome;
import core.selenium.webdrivers.FireFox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    private static int timeOutInSeconds = 0;
    private static WebDriverManager ourInstance = new WebDriverManager();
    private WebDriver driver;
    private WebDriverWait wait;

    public static WebDriverManager getInstance() {

        return ourInstance;
    }

    private WebDriverManager() {

        if (WebDriverConfig.getInstance().getWebBrowser().equals("FireFox")) {
            driver = new FireFox().getBrowser();
        } else {
            driver = new Chrome().getBrowser();
        }
        timeOutInSeconds=Integer.parseInt(WebDriverConfig.getInstance().getExplicit());
        wait = new WebDriverWait(driver, timeOutInSeconds);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(WebDriverConfig.getInstance().getImplicit()), TimeUnit.SECONDS) ;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
