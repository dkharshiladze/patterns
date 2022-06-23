package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FormPage {
    WebDriver driver;

    @FindBy(xpath = "//ul[@class='menu-list']//span[text()='Practice Form']")
    public WebElement practiceFormSpan;// = $(byXpath("//ul[@class='menu-list']//span[text()='Practice Form']"));

    public FormPage(WebDriver driver){
      this.driver = driver;
      PageFactory.initElements(driver, this);
    }
}
