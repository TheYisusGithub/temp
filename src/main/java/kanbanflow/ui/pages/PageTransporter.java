package kanbanflow.ui.pages;

import kanbanflow.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageTransporter extends BasePage {
    @FindBy(css = "[href='/login']")
    private WebElement loginButton;

    public PageTransporter() {
        driver.get("https://kanbanflow.com/");
    }

    public LoginPage goToLoginPage() {
        loginButton.click();
        return new LoginPage();
    }
}
