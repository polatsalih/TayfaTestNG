package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class Suche {


    AmazonPage page= new AmazonPage();

    // 200 tane satir, her satrida 8 tane hucre var. 1. hucredeki bir veriyi bulup konsola yazdirmak.
    // 2. verinin nerede oldugunu (hangi indexte)

    @Test
    public void aramaTesti1() {

        Driver.getDriver().get("https://www.amazon.com");

        page.aramaKutusu.sendKeys("ipad" + Keys.ENTER);

        for (int i = 0; i < page.ipadList.size(); i++) {

            for (int j = 0; i < page.laptopList.size(); j++) {

            if (page.laptopList.equals("2021 Apple 11-inch iPad Pro (Wi‑Fi, 1TB) - Silver")) {
                System.out.println("2021 Apple 11-inch iPad Pro (Wi‑Fi, 1TB) - Silver ");
            }
        }
    }

    }




    @Test
    public void aramaTesti2() {

        Driver.getDriver().get("https://www.amazon.com");

        page.aramaKutusu.sendKeys("ipad" + Keys.ENTER);

        int index=0;

        while (index < page.ipadList.size()){

            if (page.laptopList.equals("2021 Apple 11-inch iPad Pro (Wi‑Fi, 1TB) - Silver")){
                System.out.println("2021 Apple 11-inch iPad Pro (Wi‑Fi, 1TB) - Silver ");
            }

            index++;

            System.out.println(page.ipadList);
        }


    }




    @Test
    public void aramaTesti3() {

        Driver.getDriver().get("https://www.amazon.com");

        page.aramaKutusu.sendKeys("ipad" + Keys.ENTER);

      String body= Driver.getDriver().findElement(By.cssSelector("body")).getText();

        Assert.assertTrue(body.contains("Samsung Galaxy Tab A"));


    }
}