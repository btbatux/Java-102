package abstractDemo;

public class MongoDatabase extends AbstractDatabase {

    @Override
    void update() {
        System.out.println("Updating database Mongo");
    }

    @Override
    void getData() {
        System.out.println("Getting data from database Mongo");
    }

}
