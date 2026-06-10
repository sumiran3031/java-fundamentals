import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    interface Observer {
        void update(String event, Object data);
    }

    interface Subject {
        void subscribe(Observer observer);
        void unsubscribe(Observer observer);
        void notifyObservers(String event, Object data);
    }
    static class OrderService implements Subject {
        private List<Observer> observers = new ArrayList<>();
        private String orderStatus;

        public void subscribe(Observer o) { observers.add(o); }
        public void unsubscribe(Observer o) { observers.remove(o); }

        public void notifyObservers(String event, Object data) {
            for (Observer o : observers) o.update(event, data);
        }

        public void placeOrder(String orderId) {
            System.out.println("Order placed: " + orderId);
            notifyObservers("ORDER_PLACED", orderId);
        }

        public void shipOrder(String orderId) {
            System.out.println("Order shipped: " + orderId);
            notifyObservers("ORDER_SHIPPED", orderId);
        }
    }

    static class EmailService implements Observer {
        public void update(String event, Object data) {
            System.out.println("Email sent for " + event + ": " + data);
        }
    }

    static class SMSService implements Observer {
        public void update(String event, Object data) {
            System.out.println("SMS sent for " + event + ": " + data);
        }
    }

    static class InventoryService implements Observer {
        public void update(String event, Object data) {
            if (event.equals("ORDER_PLACED")) {
                System.out.println("Inventory updated for order: " + data);
            }
        }
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        orderService.subscribe(new EmailService());
        orderService.subscribe(new SMSService());
        orderService.subscribe(new InventoryService());

        orderService.placeOrder("ORD-001");
        System.out.println();
        orderService.shipOrder("ORD-001");
    }
}
