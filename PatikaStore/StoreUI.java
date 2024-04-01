package PatikaStore;

public class StoreUI implements IStoreManager {

    @Override
    public void printBrands() {
        brands.printBrands();
    }

    @Override
    public void ListNoteBooks() {
        noteBooks.listNoteBooks();
    }

    @Override
    public void addNoteBooks() {
        noteBooks.addNoteBook();
    }

    @Override
    public void deleteNoteBookById() {
        noteBooks.deleteById();
    }

    @Override
    public void findNoteBookById() {
        noteBooks.listById();
    }

    @Override
    public void ListPhones() {

    }

}
