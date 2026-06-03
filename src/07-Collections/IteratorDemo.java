import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("React");
        list.add("Docker");
        Iterator<String> it = list.iterator();
        System.out.println("Iterator forward:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals("React")) {
                it2.remove();
            }
        }
        System.out.println("After remove: " + list);
        ListIterator<String> lit = list.listIterator(list.size());
        System.out.println("ListIterator backward:");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}
