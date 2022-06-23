import Pages.HomePage;
import Steps.FormPageSteps;
import Steps.HomePageSteps;
import Steps.PracticeFormSteps;
import com.codeborne.selenide.*;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class UserRegistrationTest extends BaseTest {
    HomePageSteps homepageSteps  = new HomePageSteps(driver);
    FormPageSteps formPageSteps = new FormPageSteps(driver);
    PracticeFormSteps practiceFormSteps = new PracticeFormSteps(driver);

    @Test
    public void registerStudentTest(){
        open("/");
        homepageSteps.clickOnFormsCard();
        formPageSteps.clickOnPracticeForm();
        practiceFormSteps.setFirstName()
                 .setLastName()
               .setMobileNumber()
                 .selectGenderRadioButton()
                 .submitForm()
                 .validateModalHeaderText()
                 .vaildateStudentName()
                 .vaildateStudentGender()
                 .vaildateStudentMobile();
    }
}
