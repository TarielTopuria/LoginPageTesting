package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver chromeDriver;
    private final By userNameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.xpath("//*[@id=\"login\"]/button/i");

    public LoginPage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }

    public void setUserNameField(String userName){
        chromeDriver.findElement(userNameField).sendKeys(userName);
    }

    public void setPasswordField(String password){
        chromeDriver.findElement(passwordField).sendKeys(password);
    }

    public SecureArea clickLogin(){
        chromeDriver.findElement(loginButton).click();
        return new SecureArea(chromeDriver);
    }
}
