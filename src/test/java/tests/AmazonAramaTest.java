package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonAramaTest {

    AmazonPage page= new AmazonPage();

    @Test
    public void aramaTesti(){

        Driver.getDriver().get("https://www.amazon.com");

        Select select = new Select(page.katagoriListe);
        select.selectByVisibleText("Automotive");
        //select.selectByIndex(8);
        //select.selectByValue(); istedigimiz sekilde arama yapablrz

        page.aramaKutusu.sendKeys("car phone holder" + Keys.ENTER);


    }
}
