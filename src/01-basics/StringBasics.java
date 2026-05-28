public class StringBasics {
    public static void main(String[] args) {
        String s = "Sumiran Paparkar";
        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Substring: " + s.substring(0, 7));
        System.out.println("Contains 'Java': " + s.contains("Java"));
        System.out.println("Replace: " + s.replace("Sumiran", "Java"));
        System.out.println("Trim: " + "  hello  ".trim());
        System.out.println("charAt(0): " + s.charAt(0));
        System.out.println("indexOf('P'): " + s.indexOf('P'));
    }
}