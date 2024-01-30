package Map;

import java.util.HashMap;

public class MapValues {
    public static void main(String[] args) {
        HashMap <Integer, String> hash_map = new HashMap<Integer, String>();

        hash_map.put(10, "Mayu");
        hash_map.put(20, "The");
        hash_map.put(30, "Mayu");
        hash_map.put(40, "One");

        System.out.println("Intial mapping :" + hash_map);
        System.out.println("The collection is :" + hash_map.values());
    }
}
