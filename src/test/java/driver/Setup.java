package driver;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {

    public static WebDriver driver;

    @Before
    public void setWebDriver() throws IllegalArgumentException {

        var browser = System.getProperty("browser");
        if (browser == null) {
            browser = "chrome";
        }
        switch (browser) {
            case "chrome":
                // Executable Portable Chrome Driver
                System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
                var options = new ChromeOptions();
                options.setBinary("d:\\Internet\\brave-portable\\brave-portable.exe");
                options.addArguments("['start-maximized']");
                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                driver = new ChromeDriver(options);
                break;
            case "firefox":
                // TODO - Set up a Firefox driver
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        }
    }
}