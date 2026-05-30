public class ArrayTraversal {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
        System.out.println("Using for loop:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println("Using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
