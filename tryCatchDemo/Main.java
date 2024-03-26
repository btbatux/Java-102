package tryCatchDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Diziyi oluşturma
        int[] dizi = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Kullanıcıdan indeksi al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizideki elemanı almak için bir indeks girin: ");
        int indeks = scanner.nextInt();

        // Dizi elemanını al ve hata kontrolü yap
        try {
            int eleman = elemaniAl(dizi, indeks);
            System.out.println("Belirtilen indeksteki eleman: " + eleman);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Belirtilen indeks dizi boyutunun dışında!");
        }
    }

    // Belirtilen indeksteki elemanı döndüren metot
    public static int elemaniAl(int[] dizi, int indeks) {
        return dizi[indeks];
    }

}
