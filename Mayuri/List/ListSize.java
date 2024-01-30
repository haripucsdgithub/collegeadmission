package List;

import java.util.ArrayList;
import java.util.List;

public class ListSize {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Before" + list);

        int size = list.size();
        System.out.println("size of list = " + size);
    }
}





