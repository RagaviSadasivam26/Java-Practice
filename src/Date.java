import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.text.NumberFormat;

public class Date{
    public static void main(String[] args) {
        // 1. Print current date and time using Date and Calendar
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date (Date class): " + date);
        System.out.println("Current Date (Calendar class): " + calendar.getTime());

        // 2. Convert java.util.Date to LocalDateTime
        Instant instant = Instant.now();
        LocalDateTime localDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("Converted LocalDateTime: " + localDateTime);

        // 3. Compare two dates using Calendar and LocalDate
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal2.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Calendar Comparison: " + cal1.getTime().before(cal2.getTime()));

        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = ld1.plusDays(5);
        System.out.println("LocalDate Comparison: " + ld1.isBefore(ld2));

        // 4. Add/Subtract days, months, years
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("New Date after addition (Calendar): " + calendar.getTime());

        LocalDate newDate = ld1.plusDays(10);
        System.out.println("New Date after addition (LocalDate): " + newDate);

        // 5. Calculate days between two dates
        long daysBetween = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println("Days between: " + daysBetween);

        // 6. Get current time in different time zones
        ZonedDateTime zdtNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime zdtTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("New York Time: " + zdtNY);
        System.out.println("Tokyo Time: " + zdtTokyo);

        // 7. Convert LocalDateTime to a different time zone
        ZonedDateTime zdtConverted = localDateTime.atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("Converted to London Time: " + zdtConverted);

        // 8. Format LocalDateTime using DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted Date: " + localDateTime.format(formatter));

        // 9. Parse date string to LocalDate
        LocalDate parsedDate = LocalDate.parse("2025-03-21", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Parsed LocalDate: " + parsedDate);

        // 10. List all available time zones
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("Available Time Zones: " + zoneIds);

        // 11. Format numbers and currencies based on different locales
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("Formatted Currency (France): " + currencyFormatter.format(1234.56));

        // 12. Print current time in different languages
        DateTimeFormatter localizedFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.FRENCH);
        System.out.println("Formatted in French: " + LocalDate.now().format(localizedFormatter));

        // 13. Convert LocalDateTime to ISO 8601 format and parse it back
        String isoDate = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("ISO 8601 Format: " + isoDate);
        LocalDateTime parsedIsoDate = LocalDateTime.parse(isoDate, DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Parsed ISO 8601 LocalDateTime: " + parsedIsoDate);
    }
}
