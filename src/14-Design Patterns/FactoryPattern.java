public class FactoryPattern {
        interface Notification {
        void send(String message);
    }
    static class EmailNotification implements Notification {
        public void send(String message) {
            System.out.println("Email sent: " + message);
        }
    }

    static class SMSNotification implements Notification {
        public void send(String message) {
            System.out.println("SMS sent: " + message);
        }
    }

    static class PushNotification implements Notification {
        public void send(String message) {
            System.out.println("Push notification sent: " + message);
        }
    }

    static class NotificationFactory {
        public static Notification create(String type) {
            return switch (type.toUpperCase()) {
                case "EMAIL" -> new EmailNotification();
                case "SMS"   -> new SMSNotification();
                case "PUSH"  -> new PushNotification();
                default -> throw new IllegalArgumentException("Unknown type: " + type);
            };
        }
    }

    public static void main(String[] args) {
        Notification email = NotificationFactory.create("EMAIL");
        Notification sms   = NotificationFactory.create("SMS");
        Notification push  = NotificationFactory.create("PUSH");

        email.send("Welcome to Java!");
        sms.send("Your OTP is 1234");
        push.send("New message received");
    }
}
