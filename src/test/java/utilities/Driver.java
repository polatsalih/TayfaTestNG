package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    // eger bir class tan nesne uretilmesini istemiyorsaniz, constructor i privat yapabilirsiniz(Singleton Class)

    private Driver() {
        // WebDriver nesnemizi statc olarak olusturduk, cunku program baslar baslamaz hafizada yer almasini istyoruz
    }

    static WebDriver driver;

    // programin herhangi bir yerinden getDriver() metodu cagrilarak hafzada static olarak olsturulmus Driver
    // nesnesine ulasabiliriz. yani yeniden WebDriver nesnesi olusturmak zorunda degiliz. Driver.getDriver()

    public static WebDriver getDriver() {


        if (driver == null) {
            switch (ConfigurationReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }
        }

        return driver;
    }

    public static void closeDriver(){

        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
