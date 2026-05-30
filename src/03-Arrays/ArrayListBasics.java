import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        list.remove("Python");
        System.out.println("After remove: " + list);
        System.out.println("Contains Java: " + list.contains("Java"));
        for (String lang : list) {
            System.out.println(lang);
        }
    }
}
