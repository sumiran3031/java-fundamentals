public class EnumInSwitch {
    enum TrafficLight {
        RED, YELLOW, GREEN
    }
    enum OrderStatus {
        PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED
    }
    static String getAction(TrafficLight light) {
        return switch (light) {
            case RED -> "Stop!";
            case YELLOW -> "Slow down!";
            case GREEN -> "Go!";
        };
    }
    static int getDeliveryDays(OrderStatus status) {
        return switch (status) {
            case PENDING -> 5;
            case PROCESSING -> 4;
            case SHIPPED -> 2;
            case DELIVERED -> 0;
            case CANCELLED -> -1;
        };
    }
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + ": " + getAction(light));
        }
        System.out.println();
        for (OrderStatus status : OrderStatus.values()) {
            System.out.println(status + ": " + getDeliveryDays(status) + " days");
        }
    }
}
