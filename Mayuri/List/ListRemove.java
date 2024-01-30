package List;

import java.util.ArrayList;
import java.util.List;

public class ListRemove {
    public static void main(String[] args) {
        List <Double> list = new ArrayList<Double>(4);

        list.add(10.5);
        list.add(20.5);
        list.add(30.5);
        list.add(40.5);

        double obj = 30.0;
        System.out.println("Intial List, " + list);

        list.remove(obj);
        System.out.println("Final list: "+ list);


    }
}
