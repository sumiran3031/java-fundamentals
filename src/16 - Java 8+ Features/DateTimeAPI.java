import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate birthday = LocalDate.of(2004, 5, 15);
        System.out.println("Birthday: " + birthday);

        LocalTime now = LocalTime.now();
        System.out.println("Time: " + now);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("DateTime: " + dateTime);

        Period age = Period.between(birthday, today);
        System.out.println("Age: " + age.getYears() + " years, "
                + age.getMonths() + " months, " + age.getDays() + " days");

        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 30);
        Duration duration = Duration.between(start, end);
        System.out.println("Work duration: " + duration.toHours() + " hours "
                + (duration.toMinutes() % 60) + " minutes");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Formatted: " + today.format(formatter));

        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate lastMonth = today.minusMonths(1);
        System.out.println("Next week: " + nextWeek);
        System.out.println("Last month: " + lastMonth);

        System.out.println("Day of week: " + today.getDayOfWeek());
    }
}
