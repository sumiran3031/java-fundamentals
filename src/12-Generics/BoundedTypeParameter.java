public class BoundedTypeParameter {
    static <T extends Number> double sum(T[] arr) {
        double total = 0;
        for (T item : arr) {
            total += item.doubleValue();
        }
        return total;
    }
    static <T extends Comparable<T> & Cloneable> T findMin(T[] arr) {
        T min = arr[0];
        for (T item : arr) {
            if (item.compareTo(min) < 0) min = item;
        }
        return min;
    }
    static class NumberBox<T extends Number> {
        T value;
        NumberBox(T value) {
            this.value = value;
        }
        double doubleValue() {
            return value.doubleValue();
        }
    }
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3};
        System.out.println("Sum ints: " + sum(ints));
        System.out.println("Sum doubles: " + sum(doubles));
        NumberBox<Integer> box = new NumberBox<>(42);
        System.out.println("Double value: " + box.doubleValue());
    }
}
