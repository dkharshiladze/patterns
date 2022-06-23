package Steps;

import Data.PracticeFormData;
import Pages.PracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import org.testng.Assert;


public class PracticeFormSteps {
    PracticeFormData practiceFormData;
    PracticeFormPage practiceFormPage;

    public PracticeFormSteps(WebDriver driver) {
        practiceFormData = new PracticeFormData();
        practiceFormPage = new PracticeFormPage(driver);
    }

    public PracticeFormSteps setFirstName() {
        practiceFormPage.firstnameField.sendKeys(practiceFormData.firstname);
        return this;
    }

    public PracticeFormSteps setLastName() {
        practiceFormPage.lastnameField.sendKeys(practiceFormData.lastname);
        return this;
    }

    public PracticeFormSteps setMobileNumber() {
        practiceFormPage.mobileField.sendKeys(practiceFormData.mobile);
        return this;
    }

    public PracticeFormSteps selectGenderRadioButton() {
        for (WebElement el : practiceFormPage.genderRadioButtons) {
            if(el.getAttribute("value").equalsIgnoreCase(practiceFormData.gender))
                executeJavaScript("arguments[0].click();", el);
        }

        return this;
    }

    public PracticeFormSteps submitForm() {
        WebElement submitButton = practiceFormPage.submitButton;
        executeJavaScript("arguments[0].click();", submitButton);
        return this;
    }

    public PracticeFormSteps validateModalHeaderText() {
        Assert.assertEquals(practiceFormPage.modalHeader.getText(), "Thanks for submitting the form");
        return this;
    }

    public PracticeFormSteps vaildateStudentName() {
        Assert.assertEquals(practiceFormPage.studentName.getText(), practiceFormData.firstname + " " + practiceFormData.lastname);
        return this;
    }

    public PracticeFormSteps vaildateStudentGender() {
        Assert.assertEquals(practiceFormPage.studentGender.getText(), practiceFormData.gender);
        return this;
    }

    public PracticeFormSteps vaildateStudentMobile() {
        Assert.assertEquals(practiceFormPage.studentMobile.getText(), practiceFormData.mobile);
        return this;
    }
}
