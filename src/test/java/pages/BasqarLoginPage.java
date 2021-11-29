package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasqarLoginPage {

    public BasqarLoginPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@formcontrolname='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Dashboard']")
    public WebElement dashboard;

    @FindBy(xpath = "//div[@class='hot-toast-message']")
    public WebElement message;


}
