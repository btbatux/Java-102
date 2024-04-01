package EnCokGecenKelime;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni girin:");
        String metin = scanner.nextLine();

        // Metni kelimelere ayır
        String[] kelimeler = metin.split("\\s+");

        // Kelimeleri saklamak için HashMap oluştur
        Map<String, Integer> kelimeSayisi = new HashMap<>();

        // Her kelimenin sayısını hesapla
        for (String kelime : kelimeler) {
            // Küçük/büyük harf duyarlılığını kaldırmak için
            String duzeltilmisKelime = kelime.toLowerCase();
            // Eğer kelime zaten map'te varsa, sayısını artır, yoksa yeni bir giriş ekle
            kelimeSayisi.put(duzeltilmisKelime, kelimeSayisi.getOrDefault(duzeltilmisKelime, 0) + 1);
        }

        // En çok geçen kelimeyi bul
        String enCokGecenKelime = null;
        int enCokGecenKelimeSayisi = 0;

        for (Map.Entry<String, Integer> entry : kelimeSayisi.entrySet()) {
            if (entry.getValue() > enCokGecenKelimeSayisi) {
                enCokGecenKelime = entry.getKey();
                enCokGecenKelimeSayisi = entry.getValue();
            }
        }

        // Sonucu ekrana yazdır
        System.out.println("En çok geçen kelime: " + enCokGecenKelime + ", Sayısı: " + enCokGecenKelimeSayisi);
    }
}
