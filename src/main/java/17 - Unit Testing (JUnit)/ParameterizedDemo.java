package unittesting;

public class ParameterizedDemo {

    boolean isPositive(int n) {
        return n > 0;
    }

    int square(int n) {
        return n * n;
    }

    boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        ParameterizedDemo demo = new ParameterizedDemo();

        System.out.println("isPositive(5): " + demo.isPositive(5));
        System.out.println("square(4): " + demo.square(4));
        System.out.println("isPalindrome(\"madam\"): " + demo.isPalindrome("madam"));
        System.out.println("isPalindrome(\"hello\"): " + demo.isPalindrome("hello"));
    }
}
