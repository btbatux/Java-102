import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\pc\\IdeaProjects\\untitled\\src\\notlar.txt";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        MetinYazdir.dosyayaYazdir(metin,path);
        MetinOku.metinOku(path);

    }
}