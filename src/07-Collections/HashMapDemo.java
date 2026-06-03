import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Java", 90);
        map.put("Python", 85);
        map.put("React", 80);
        map.put("Spring", 95);
        System.out.println("Map: " + map);
        System.out.println("Get Java: " + map.get("Java"));
        System.out.println("Size: " + map.size());
        System.out.println("Contains key React: " + map.containsKey("React"));
        System.out.println("Contains value 85: " + map.containsValue(85));
        map.remove("Python");
        System.out.println("After remove: " + map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("Docker score: " + map.getOrDefault("Docker", 0));
    }
}
