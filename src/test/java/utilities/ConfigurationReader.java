package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    // ConfiguratonReader class in projemizin heryerinden nesne uretmeden, miras almadan kullanilabilecek sekilde
    // tasarlandi
    //static:program calsr calsmaz bellekte yer tutmaya yarayan keywort  tur

    static Properties properties;

    static {
        // okumak istedigimiz configuration.properties file in dosya yolu configuration.properties
        String  path="configuration.properties";

        try {
            // okumak istediginiz dosyanin path adresini yaziyorsun
            FileInputStream file=new FileInputStream(path);
            properties = new Properties();
            // fileInputStream dan urettigim file dosyasi burada bunu kullanacak
            properties.load(file);
        }catch (Exception e){

        }

    }
    public static String getProperty(String key){
        return  properties.getProperty(key);
    }

}
