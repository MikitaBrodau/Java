package File;

import java.time.MonthDay;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Holiday> holidays = new ArrayList<>();

    public List<Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }

    public void checkDay(int month, int day) {
        for (Holiday h :
                holidays) {
            if (h.monthDay.getDayOfMonth() == day && h.monthDay.getMonth().getValue() == month) {
                System.out.println(h.toString());
            }
        }
    }

    static class Holiday {
        private final boolean isWeekend;
        private final boolean isHoliday;
        private final String description;
        private final MonthDay monthDay;

        public Holiday(boolean isWeekend, boolean isHoliday, String description, int month, int monthDay) {
            this.isWeekend = isWeekend;
            this.isHoliday = isHoliday;
            this.description = description;
            this.monthDay = MonthDay.of(month, monthDay);
        }

        @Override
        public String toString() {
            return "That's day" +
                    "\tis Weekend: " + isWeekend +
                    "\tis Holiday: " + isHoliday +
                    "\tdescription: " + description;
        }
    }
}

