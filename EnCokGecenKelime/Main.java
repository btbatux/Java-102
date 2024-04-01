package EnCokGecenKelime;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni girin:");
        String metin = scanner.nextLine();

        // Metni kelimelere ayırma
        String[] kelimeler = metin.split("\\s+");

        // Kelimeleri saklamak için HashMap oluşturma
        HashMap<String, Integer> kelimeSayilari = new HashMap<>();

        // Kelimeleri döngüyle tek tek işleme
        for (String kelime : kelimeler) {
            // Kelimeyi HashMap'e ekleme veya sayısını artırma
            if (kelimeSayilari.containsKey(kelime)) {
                kelimeSayilari.put(kelime, kelimeSayilari.get(kelime) + 1);
            } else {
                kelimeSayilari.put(kelime, 1);
            }
        }

        // En çok geçen kelimeyi bulma
        String enCokGecenKelime = null;
        int enCokGecenSayi = 0;

        for (Map.Entry<String, Integer> entry : kelimeSayilari.entrySet()) {
            if (entry.getValue() > enCokGecenSayi) {
                enCokGecenKelime = entry.getKey();
                enCokGecenSayi = entry.getValue();
            }
        }

        // Sonucu ekrana yazdırma
        System.out.println("En çok geçen kelime: " + enCokGecenKelime);
        System.out.println("Bu kelime " + enCokGecenSayi + " kez geçiyor.");
    }

}
