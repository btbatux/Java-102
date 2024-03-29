package abstractDemo;

public class Main {
    public static void main(String[] args) {

        AbstractDatabase abstractDatabase2 = new MySqlDatabase();

        AbstractDatabase abstractDatabase = new MongoDatabase();

        abstractDatabase.add();
        abstractDatabase2.add();

        System.out.println("");

        abstractDatabase.delete();
        abstractDatabase2.delete();

        abstractDatabase.getData();
        abstractDatabase2.getData();

        abstractDatabase.update();
        abstractDatabase2.update();

    }

}
