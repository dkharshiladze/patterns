package Steps;

import Pages.FormPage;
import org.openqa.selenium.WebDriver;

public class FormPageSteps {
    FormPage formPage;

    public FormPageSteps(WebDriver driver) {
        formPage = new FormPage(driver);
    }

    public FormPageSteps clickOnPracticeForm() {
        formPage.practiceFormSpan.click();
        return this;
    }
}
