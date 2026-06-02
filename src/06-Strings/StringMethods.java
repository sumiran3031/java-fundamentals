public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello, Java World!";
        System.out.println("Length: " + s.length());
        System.out.println("charAt(7): " + s.charAt(7));
        System.out.println("indexOf('J'): " + s.indexOf('J'));
        System.out.println("substring(7): " + s.substring(7));
        System.out.println("substring(7,11): " + s.substring(7, 11));
        System.out.println("toUpperCase: " + s.toUpperCase());
        System.out.println("toLowerCase: " + s.toLowerCase());
        System.out.println("replace: " + s.replace("Java", "Python"));
        System.out.println("contains 'Java': " + s.contains("Java"));
        System.out.println("startsWith 'Hello': " + s.startsWith("Hello"));
        System.out.println("endsWith 'World!': " + s.endsWith("World!"));
        System.out.println("trim: " + "  hello  ".trim());
        System.out.println("isEmpty: " + s.isEmpty());
    }
}
