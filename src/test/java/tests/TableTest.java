package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.W3Schools;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class TableTest {

    W3Schools schools = new W3Schools();
    String url ="https://www.w3schools.com/html/html_tables.asp";

    // (priority = 0) siralama yapmak icin en az iki degsken belrtmek getekir
    @Test
    public void tumBasliklar(){


        Driver.getDriver().get(url);

        for (WebElement element:schools.basliklar) {
            System.out.println(element.getText());
        }
    }

    @Test(priority =0)
    public void tumHucreler(){
        Driver.getDriver().get(url);
        for (WebElement element:schools.hucreler) {
            System.out.println(element.getText());
        }
    }

    @Test
    public void tumBasliklarReusableMethods(){

        Driver.getDriver().get(url);

        List<WebElement> list = ReusableMethods.getBaslklar();
        for(WebElement element:list){
            System.out.println(element.getText());
            //Assert.assertFalse(element.getText().contains("Company"),"Text is not exist"); // bu nicin hata veryor
           //+ Assert.assertFalse(element.getText().contains("Company,Contact,Country"),"Text is not exist");
           // Assert.assertTrue(element.getText().contains("Company,Contact,Country"),"Text is not exist"); bunun hata vermesi anlasliyor
        }


    }

    @Test(priority = 1)
    public void satirSutunTesti(){

        Driver.getDriver().get(url);

        WebElement element= ReusableMethods.getSatirSutun(3,2);

        System.out.println(element.getText());

        Assert.assertEquals(element.getText(),"Francisco Changg");
    }

    @Test
    public void sutun(){

        Driver.getDriver().get(url);
String str = "";
        List<WebElement> list= ReusableMethods.getSutun(2);
        for(WebElement element:list){
            str=element.getText();
            System.out.println(str);
        }
       // Assert.assertTrue(str,"Maria Anders");
    }
}
