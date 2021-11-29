package exelautomation;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    @Test
    public void test() throws IOException {

String dosyaYolu="src/test/resources/veriler.xlsx";

        FileInputStream file = new FileInputStream(dosyaYolu);



        file.close();

    }
}
