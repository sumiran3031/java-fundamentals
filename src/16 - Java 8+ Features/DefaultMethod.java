public class DefaultMethod {
    interface Vehicle {
        String getBrand();
        default void printDetails() {
            System.out.println("Vehicle brand: " + getBrand());
        }

        static Vehicle createDefault() {
            return () -> "Default Brand";
        }
    }

    interface Greetable {
        default String greet() {
            return "Hello!";
        }
    }

    interface Farewell {
        default String sayBye() {
            return "Goodbye!";
        }
    }
    static class Person implements Greetable, Farewell {
        String name;
        Person(String name) { this.name = name; }
    }

    public static void main(String[] args) {
        Vehicle car = () -> "Toyota";
        car.printDetails();

        Vehicle bike = () -> "Yamaha";
        bike.printDetails();
        Vehicle defaultVehicle = Vehicle.createDefault();
        defaultVehicle.printDetails();
        Person p = new Person("Sumiran");
        System.out.println(p.greet());
        System.out.println(p.sayBye());
    }
}
