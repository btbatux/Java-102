package InterfacesDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        IDatabase database = new Customer();
        IDatabase database2 = new Student();
        database.log();
        database2.log();

    }

}
