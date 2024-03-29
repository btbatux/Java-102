package constructorDemo;

public class Car {
    private String color;
    private String model;
    private double engine;
    private int doors;

    public Car(String color, String model) {
        this(color, model, 0, 0);
    }

    public Car() {
        this("Bilgi yok,", "Bilgi yok", 0, 0);
    }

    public Car(String color, String model, double engine, int doors) {
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.doors = doors;
    }

    public void showInfos() {
        {
            System.out.println(this.color);
            System.out.println(this.model);
            System.out.println("Motor: " + this.engine);
            System.out.println("Kapı: " + this.doors);
        }

    }
}
