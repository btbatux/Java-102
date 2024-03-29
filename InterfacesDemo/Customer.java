package InterfacesDemo;

public class Customer implements IDatabase {

    @Override
    public void log() {

        System.out.println("Müşteri Eklendi...");

    }

}
