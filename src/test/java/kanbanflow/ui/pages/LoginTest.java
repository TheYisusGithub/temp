package kanbanflow.ui.pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import core.selenium.WebDriverManager;

public class LoginTest {
    Login login;
    WebDriver driver;
    @Before
    public void setUp() {
        driver = WebDriverManager.getInstance().getDriver();
        driver.get("https://kanbanflow.com/login");
        login = new Login(driver);
    }
    @After
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void signIn() {
        login.signIn("jesus.menacho@fundacion-jala.org","lapizx123");
    }
}

