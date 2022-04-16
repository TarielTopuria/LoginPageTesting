package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea {
    WebDriver chromeDriver;

    private final By statusSuccess = By.id("flash");

    public SecureArea (WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }

    public String getStatusSuccess(){
        return chromeDriver.findElement(statusSuccess).getText();
    }
}
