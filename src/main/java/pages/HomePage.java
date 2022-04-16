package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver chromeDriver;

    private final By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }

    public LoginPage clickFormAuthenticationLink(){
        chromeDriver.findElement(formAuthenticationLink).click();
        return new LoginPage(chromeDriver);
    }
}
