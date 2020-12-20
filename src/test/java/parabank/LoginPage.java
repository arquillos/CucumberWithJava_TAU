package parabank;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private static final String HOME_PAGE_URL = "http://parabank.parasoft.com/parabank/index.htm";

    void goToHomePage(){
        driver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }

    void setCredentials(String user, String passwd) {
        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(passwd);
        driver.findElement(By.cssSelector("div.login .button")).click();

        WebElement welcomeMessage = driver.findElement(By.cssSelector("#leftPanel p.smallText"));
        wait.forElementToBeDisplayed(5, welcomeMessage, "Welcome message");
    }

    void isUserLogged() {
        By logOutLink = new By.ByLinkText("Log Out");
        wait.forPresenceOfElements(5, logOutLink, "Log Out");
    }
}
