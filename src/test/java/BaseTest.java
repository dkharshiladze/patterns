import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    WebDriver driver;

    public BaseTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);
        config();
    }

    private void config() {
        savePageSource = false;
        holdBrowserOpen = false;
        screenshots = false;
        baseUrl = "https://demoqa.com";
        driver.manage()
                .window()
                .maximize();
    }

}
