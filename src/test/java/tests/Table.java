package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Table {

    public class Test1 {

        WebDriver driver;
        @BeforeClass
        public void setup(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }


        @Test
        public void test1(){
            driver.get("file:///C:/Users/pc/Desktop/aaa.html");
            WebElement table = driver.findElement(By.cssSelector("table#id"));
            searchTable(table, "a");
        }

        @AfterClass
        public void tearDown(){
            driver.close();
            driver.quit();
        }


        public void searchTable(WebElement table, String strSearch){
            List<WebElement> rows = table.findElements(By.cssSelector("tr"));
            for (int i = 0; i < rows.size(); i++) {
                if (rows.get(i).getText().contains(strSearch)){
                    List<WebElement> cols = rows.get(i).findElements(By.cssSelector("td"));
                    for (int j = 0; j < cols.size(); j++) {
                        if (cols.get(j).getText().contains(strSearch)){
                            System.out.println((i+1) + ":" + (j+1) + " , " + cols.get(j).getText());
                        }
                    }
                }
            }
        }


        public void searchTable2(WebElement table, String strSearch){
            List<WebElement> names = table.findElements(By.cssSelector("tr")); // her satirin 1. hucresini al.
            boolean nichtGefunden= true;
            for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i).getText());
                if (names.get(i).getText().contains(strSearch)){
                    System.out.println((i+1) + ":" + " , " + names.get(i).getText());
                    nichtGefunden=false;
                    break;
                }
            }

            if (nichtGefunden){
                System.out.println("Aranan isim bulunamadi");
            }

        }





    }





}
