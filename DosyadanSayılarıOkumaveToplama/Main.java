package DosyadanSayılarıOkumaveToplama;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DosyadanSayılarıOkumaveToplama {
    public static void main(String[] args) {
        int toplam = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("sayilar.txt"))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                int sayi = Integer.parseInt(satir);
                toplam += sayi;
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }

        System.out.println("Dosyadaki tüm sayıların toplamı: " + toplam);
    }
}
