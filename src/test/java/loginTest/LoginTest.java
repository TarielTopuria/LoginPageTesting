package loginTest;

import base.BaseTests;
import org.junit.Test;
import pages.LoginPage;
import pages.SecureArea;
import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTests {
    @Test
    public void testSeccessLogin(){
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.setUserNameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureArea secureArea = loginPage.clickLogin();
        assertTrue(secureArea.getStatusSuccess().contains("You logged into a secure area!"));
    }
}