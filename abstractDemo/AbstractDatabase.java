package abstractDemo;

public abstract class AbstractDatabase {

    // Ortak add
    public void add() {
        System.out.println("Abstract Database Add ");
    }

    // Ortak delete
    public void delete() {
        System.out.println("Abstract Database Delete ");
    }

    abstract void update();

    abstract void getData();

}
