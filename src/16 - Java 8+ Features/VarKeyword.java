import java.util.*;

public class VarKeyword {
    public static void main(String[] args) {

        var age = 21;
        var price = 99.99;
        var name = "Sumiran";
        var isActive = true;

        System.out.println(age + " " + price + " " + name + " " + isActive);

        var list = new ArrayList<String>();
        list.add("Java");
        list.add("Spring");
        System.out.println("List: " + list);

        var map = new HashMap<String, Integer>();
        map.put("Java", 90);
        map.put("Python", 85);
        System.out.println("Map: " + map);

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        var numbers = List.of(1, 2, 3, 4, 5);
        var sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);
        var text = "Hello";
        System.out.println("Text: " + text);
    }
}
