public class EnumBasics {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
        FRIDAY, SATURDAY, SUNDAY
    }

    enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }

    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today: " + today);
        System.out.println("Ordinal: " + today.ordinal());
        System.out.println("Name: " + today.name());

        System.out.println("All days:");
        for (Day day : Day.values()) {
            System.out.println(day.ordinal() + " - " + day);
        }

        System.out.println("Is Monday: " + (today == Day.MONDAY));

        Day friday = Day.valueOf("FRIDAY");
        System.out.println("Friday: " + friday);
    }
}
