public class ReverseString {
    static String reverseUsingBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    static String reverseUsingLoop(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        String str = "Sumiran";
        System.out.println("Original: " + str);
        System.out.println("Reversed (Builder): " + reverseUsingBuilder(str));
        System.out.println("Reversed (Loop): " + reverseUsingLoop(str));
    }
}
