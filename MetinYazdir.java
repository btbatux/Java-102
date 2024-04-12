import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MetinYazdir {
    static FileWriter fileWriter = null;
    static PrintWriter printWriter = null;

    public static void dosyayaYazdir(String metin, String path) {

        try {
            // FileWriter ve PrintWriter nesneleri oluşturulur
            fileWriter = new FileWriter(path, true);
            printWriter = new PrintWriter(fileWriter);
            // Metin dosyaya yazdırılır
            printWriter.println(metin);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            // Dosya kapatılır
            if (printWriter != null) {
                printWriter.close();
            }
        }
        try {
            if (fileWriter != null) {
                fileWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
