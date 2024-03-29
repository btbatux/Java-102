package abstractDemo;

public class MySqlDatabase extends AbstractDatabase {

    @Override
    void update() {
        System.out.println("Mysql database updated.");
    }

    @Override
    void getData() {
        System.out.println("Mysql database get data.");
    }

}
