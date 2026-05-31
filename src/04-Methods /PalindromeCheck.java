public class PalindromeCheck {
    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
    static boolean isPalindromeNumber(int n) {
        int original = n, reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        System.out.println("'madam' palindrome: " + isPalindrome("madam"));
        System.out.println("'hello' palindrome: " + isPalindrome("hello"));
        System.out.println("121 palindrome: " + isPalindromeNumber(121));
        System.out.println("123 palindrome: " + isPalindromeNumber(123));
    }
}
