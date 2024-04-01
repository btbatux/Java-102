package KitapSiralayici;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Kitap nesnelerini oluştur
        Book book1 = new Book("B Harry Potter", 350, "J.K. Rowling", "2001-05-12");
        Book book2 = new Book("Z Lord of the Rings", 500, "J.R.R. Tolkien", "1954-07-29");
        Book book3 = new Book("U To Kill a Mockingbird", 280, "Harper Lee", "1960-07-11");
        Book book4 = new Book("1984", 320, "George Orwell", "1949-06-08");
        Book book5 = new Book("A Great Gatsby", 200, "F. Scott Fitzgerald", "1925-04-10");

        // Kitapları isme göre sıralayan TreeSet oluştur
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(book1);
        bookSetByName.add(book2);
        bookSetByName.add(book3);
        bookSetByName.add(book4);
        bookSetByName.add(book5);

        System.out.println("Kitaplar isme göre sıralı:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        System.out.println();
        // Kitapları sayfa sayısına göre sıralayan TreeSet oluştur
        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(book -> book.getPageCount()));
        bookSetByPageCount.add(book1);
        bookSetByPageCount.add(book2);
        bookSetByPageCount.add(book3);
        bookSetByPageCount.add(book4);
        bookSetByPageCount.add(book5);

        System.out.println("\nKitaplar sayfa sayısına göre sıralı:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}