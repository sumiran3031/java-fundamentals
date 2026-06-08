public class GenericClass {
    static class Box<T> {
        private T value;
        Box(T value) {
            this.value = value;
        }
        T getValue() {
            return value;
        }
        void setValue(T value) {
            this.value = value;
        }
        public String toString() {
            return "Box[" + value + "]";
        }
    }
    static class Pair<K, V> {
        K key;
        V value;
        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public String toString() {
            return "Pair[" + key + " = " + value + "]";
        }
    }
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(42);
        Box<String> strBox = new Box<>("Sumiran");
        System.out.println(intBox);
        System.out.println(strBox);
        Pair<String, Integer> pair = new Pair<>("Age", 21);
        System.out.println(pair);
    }
}
