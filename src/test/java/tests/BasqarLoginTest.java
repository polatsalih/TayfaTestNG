package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasqarLoginPage;
import utilities.Driver;

public class BasqarLoginTest {

    BasqarLoginPage login= new BasqarLoginPage();

    String url= "https://demo.mersys.io/";

    @Test(priority = 0)
    public void basqarLogin(){

        Driver.getDriver().get(url);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3);

        login.username.sendKeys("richfield.edu");
        login.password.sendKeys("Richfield2020!");
        login.loginButton.click();

        wait.until(ExpectedConditions.visibilityOf(login.dashboard));

        Assert.assertTrue(login.dashboard.isDisplayed(),"Dashboard is not exist");

        System.out.println(login.dashboard.getText());
    }

    @Test(priority = 1)
    public void basqarNegativLogin(){

        Driver.getDriver().get(url);
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),3);

        login.username.sendKeys("richfield.ed");
        login.password.sendKeys("Richfield2020!");
        login.loginButton.click();

        Assert.assertEquals(login.message.getText(),"Invalid username or password");


    }
}
