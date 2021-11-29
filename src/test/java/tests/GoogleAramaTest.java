package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class GoogleAramaTest {

    @Test

    public void amazonTest() {

        Driver.getDriver().get("https://www.amazon.com");

       WebElement arama = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

       arama.sendKeys("Iphone");

        ReusableMethods.sleep(2000);

       Driver.getDriver().findElement(By.xpath("//input[@type='submit']  ")).click();


       Driver.getDriver().navigate().back();

       String baslk= Driver.getDriver().getTitle();
        System.out.println(baslk);
        List<WebElement> linkler= Driver.getDriver().findElements(By.tagName("a"));

        for (WebElement element:linkler) {
            System.out.println(element.getText());
        }

//        String amazonTitle = Driver.getDriver().getTitle();
//        System.out.println(amazonTitle);

//        Driver.getDriver().get("https://www.google.com");
//
//        ReusableMethods.sleep(3000);
//
//        Driver.getDriver().navigate().back();
//        ReusableMethods.sleep(2000);
//        Driver.getDriver().navigate().forward();
        ReusableMethods.sleep(2000);

        Driver.closeDriver();
    }
}
