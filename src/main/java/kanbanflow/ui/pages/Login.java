package kanbanflow.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    @FindBy(id = "email")
    WebElement inputEmail;
    @FindBy(id = "password")
    WebElement inputPassword;
    @FindBy(className = "form-actionButton")
    WebElement submitButton;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void signIn(String email, String password) {
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        submitButton.click();
    }

}
