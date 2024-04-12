import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class MetinOku {
    static FileReader fileReader;
    static BufferedReader bufferedReader;

    public static void metinOku(String dosyaYolu) {
        try {
            bufferedReader = new BufferedReader(fileReader = new FileReader(dosyaYolu));
            String satir = "";
            while ((satir = bufferedReader.readLine()) != null) {
                System.out.println(satir);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
