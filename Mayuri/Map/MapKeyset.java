package Map;

import java.util.HashMap;

public class MapKeyset {
    public static void main(String[] args) {
        HashMap <String, Integer> hash_map = new HashMap<String, Integer>();

        hash_map.put ("Mayu", 10);
        hash_map.put ("The", 20);
        hash_map.put ("One", 30);

        System.out.println("Initial mappings are:" + hash_map);
        System.out.println("The set is:" + hash_map.keySet());

    }
}
