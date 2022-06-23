package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


public class PracticeFormPage {
    WebDriver driver;

    @FindBy(id = "firstName")
    public WebElement firstnameField;

    @FindBy(id = "lastName")
    public WebElement lastnameField;

    @FindBy(id = "userNumber")
    public WebElement mobileField ;

    @FindBy(css = ".modal-header")
    public WebElement  modalHeader;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(name = "gender")
    public List<WebElement> genderRadioButtons;

    @FindBy(xpath = "//tbody//td[text()='Student Name']/following-sibling::td")
    public WebElement studentName;

    @FindBy(xpath = "//tbody//td[text()='Gender']/following-sibling::td")
    public WebElement studentGender ;

    @FindBy(xpath = "//tbody//td[text()='Mobile']/following-sibling::td")
    public WebElement studentMobile;

    public  PracticeFormPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
