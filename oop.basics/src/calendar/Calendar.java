package calendar;

import java.time.MonthDay;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Holiday> holidays;

    public void addHolidays(boolean isWeekend, boolean isHoliday, String description, int month, int monthDay) {
        this.holidays.add(new Holiday(isWeekend, isHoliday, description, month, monthDay));
    }

    public List<Holiday> getHolidays() {
        return holidays;
    }

    public Calendar() {
        this.holidays = new ArrayList<>();
    }

    public Calendar(List<Holiday> holidays) {
        this.holidays = holidays;
    }

    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }

    public Holiday getHolidayDay(int month, int day) {
        for (Holiday holiday : holidays) {
            if (holiday.monthDay.getDayOfMonth() == day && holiday.monthDay.getMonth().getValue() == month) {
                return holiday;
            }
        }
        return null;
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

    public static void main(String[] args) {
        List<Calendar.Holiday> holidays = new ArrayList<>();
        holidays.add(new Calendar.Holiday(false, true, "all man day", 2, 23));
        holidays.add(new Calendar.Holiday(false, true, "all lovers day", 2, 14));
        Calendar calendar = new Calendar(holidays);
        calendar.getHolidays().add(new Calendar.Holiday(true, true, "All womans day", 3, 8));
        System.out.println(calendar.getHolidayDay(3, 8));
        System.out.println(calendar.getHolidayDay(2, 23));
        System.out.println(calendar.getHolidayDay(2, 14));
    }
}
