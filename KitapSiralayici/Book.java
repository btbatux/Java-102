package KitapSiralayici;

public class Book implements Comparable<Book> {
    private String title; // kitap ismi
    private int pageCount; // sayfa sayisi
    private String author; // yazar ismi
    private String publicationDate; // yayin tarihi

    public Book(String title, int pageCount, String author, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.title.compareTo(otherBook.title);

    }

    public int getPageCount() {
        return pageCount;
    }

    // toString metodu, Book nesnesini bir String'e dönüştürür
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }

}
