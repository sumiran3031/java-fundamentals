import java.util.regex.*;
public class RegexBasics {
    public static void main(String[] args) {
        String email = "sumiran@gmail.com";
        String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        System.out.println("Valid email: " + email.matches(emailRegex));
        String phone = "9876543210";
        System.out.println("Valid phone: " + phone.matches("\\d{10}"));
        String text = "Java 17 released in 2021";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println("Found number: " + m.group());
        }
        String result = text.replaceAll("\\d+", "##");
        System.out.println("Replaced: " + result);
    }
}
