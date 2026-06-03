import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("React");
        list.add("Docker");
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Get index 1: " + list.get(1));
        list.set(2, "Angular");
        System.out.println("After set: " + list);
        list.remove("Docker");
        System.out.println("After remove: " + list);
        Collections.sort(list);
        System.out.println("After sort: " + list);
        System.out.println("Contains Spring: " + list.contains("Spring"));
        System.out.println("Index of Java: " + list.indexOf("Java"));
    }
}
