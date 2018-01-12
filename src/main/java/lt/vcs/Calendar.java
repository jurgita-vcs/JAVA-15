package lt.vcs;

import java.time.LocalDateTime;

public class Calendar {
    public static String getTimeOfDay(LocalDateTime dateTime) {
        int hour = dateTime.getHour();

        if (hour < 6) {
            return "Night";
        }
        if (hour < 12) {
            return "Morning";
        }
        if (hour < 18) {
            return "Afternoon";
        }
        return "Evening";
    }
}
