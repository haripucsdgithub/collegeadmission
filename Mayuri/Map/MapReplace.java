package Map;

import java.util.HashMap;

public class MapReplace {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 400);
        map.put("d", 400);
        System.out.println("HashMap :" + map.toString());
        map.replace("c", 400, 300);
        System.out.println("New HashMap:" + map.toString());

    }
}
