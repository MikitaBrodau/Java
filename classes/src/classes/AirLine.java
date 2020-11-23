package classes;
/* Task 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

Найти и вывести:

a) список рейсов для заданного пункта назначения;

b) список рейсов для заданного дня недели;

c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

public class AirLine {
    private enum DayOfWeek {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
        String day;

        DayOfWeek(int i) {
            switch (i) {
                case (1) -> this.day = "Monday";
                case (2) -> this.day = "Tuesday";
                case (3) -> this.day = "Wednesday";
                case (4) -> this.day = "Thursday";
                case (5) -> this.day = "Friday";
            }
        }
    }

    private String Destination;
    private int flightId;
    private String aircraftType;
    private double departureTime;
    private DayOfWeek dayOfWeek;

    public AirLine(String destination, int flightId, String aircraftType, double departureTime, int dayOfWeek) {
        Destination = destination;
        this.flightId = flightId;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
    }
}
