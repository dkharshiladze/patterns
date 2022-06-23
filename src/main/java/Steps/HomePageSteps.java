package Steps;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class HomePageSteps {
    HomePage homePage;

    public HomePageSteps(WebDriver driver) {
        homePage = new HomePage(driver);
    }

    public HomePageSteps clickOnFormsCard() {
        System.out.println(homePage.formCard);
        executeJavaScript("arguments[0].click();", homePage.formCard);
        return this;
    }
}
