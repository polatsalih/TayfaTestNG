package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReusableMethods {

    public static void sleep(int miliseconds){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // buseklde bir metod yazarak da ilgili tabloyu alabiliriz ama bu POM degil.
    public static List<WebElement> getBaslklar(){

        return Driver.getDriver().findElements(By.xpath("(//table)[1]//th"));
    }

    public static List<WebElement> getSatirlar(int tablo){
        // br web sayfasnda birden fzla tablo varsa kodumuz dnamik yapabiliriz
        return Driver.getDriver().findElements(By.xpath("(//table)["+tablo+"]/tbody/tr"));

// bir web sayfasinda genellikle bir tablo olur ve su seklde formilize ederiz=findElements(By.xpath("//table/tbody/tr")
        //return Driver.getDriver().findElements(By.xpath("(//table)[1]/tbody/tr"));
    }

    public static List<WebElement> getTumHucreler(){

        return Driver.getDriver().findElements(By.xpath("(//table)[1]/tbody/td"));
    }

    public static List<WebElement> getSatirdakiHucreler(int satir){
// hata verirse ik olan parantezleri bire indir
        return Driver.getDriver().findElements(By.xpath("((//table)[1]/tbody/tr)["+satir+"]"));
    }

    public static List<WebElement> getSutun(int sutun){
        return Driver.getDriver().findElements(By.xpath("(//table)[1]//tr/td["+sutun+"]"));
    }

    public static WebElement getSatirSutun(int satir, int sutun){
       // (//table)[1]//tr[5]/td[2]
        return Driver.getDriver().findElement(By.xpath("(//table)[1]//tr["+satir+"]/td["+sutun+"]"));
    }
}
