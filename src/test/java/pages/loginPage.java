package pages;

import Driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Constants;
import utilities.PropertiesReader;


public class loginPage {

    public loginPage() {PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(id="txtUsername")
    public WebElement usernameLoginInput;

    @FindBy(id="txtPassword")
    public WebElement passwordLoginInput;

    @FindBy(id="btnLogin")
    public WebElement loginButton;

    @FindBy(id="spanMessage")
    public WebElement messageLabel;

    public void doLogin(String username,String password) {
        this.usernameLoginInput.sendKeys(username);
        this.passwordLoginInput.sendKeys(password);
        this.loginButton.click();
    }
}
