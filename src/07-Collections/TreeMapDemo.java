import java.util.TreeMap;
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Banana", 3);
        map.put("Apple", 5);
        map.put("Mango", 2);
        map.put("Cherry", 8);
        System.out.println("TreeMap: " + map);
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
        System.out.println("HeadMap (< Mango): " + map.headMap("Mango"));
        System.out.println("TailMap (>= Mango): " + map.tailMap("Mango"));
        System.out.println("Descending: " + map.descendingMap());
    }
}
