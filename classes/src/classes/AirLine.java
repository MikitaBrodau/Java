package classes;
/* Task 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

Найти и вывести:

a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AirLine {

    private String destination;
    private int flightId;
    private String aircraftType;
    private double departureTime;
    private String dayOfWeek;

    public AirLine(String destination, int flightId, String aircraftType, double departureTime, String dayOfWeek) {
        this.destination = destination.toUpperCase();
        this.flightId = flightId;
        this.aircraftType = aircraftType.toUpperCase();
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek.toUpperCase();
    }

    @Override
    public String toString() {
        return "AirLine" +
                "\nDestination: " + destination +
                "\nflightId: " + flightId +
                "\naircraftType: " + aircraftType +
                "\ndepartureTime: " + departureTime +
                "\ndayOfWeek: " + dayOfWeek;
    }


    public static class AirLineDataBase implements DataBase<AirLine> {
        private static final List<AirLine> airLines = new ArrayList<>();

        public AirLineDataBase() {
        }

        @Override
        public void addIn_DB(Object obj) {
            airLines.add((AirLine) obj);
        }

        @Override
        public List<AirLine> get_DB() {
            return airLines;
        }

        @Override
        public void sortBy_FirstCondition(Object Destination) {
            for (AirLine a : airLines) {
                Pattern pattern = Pattern.compile((String) Destination);
                Matcher matcher = pattern.matcher(a.destination);
                if (matcher.find()) {
                    System.out.println(a.toString());
                }
            }
        }

        @Override
        public void sortBy_SecondCondition(Object dayOfWeek) {
            for (AirLine a : airLines) {
                Pattern pattern = Pattern.compile((String) dayOfWeek);
                Matcher matcher = pattern.matcher(a.dayOfWeek);
                if (matcher.find()) {
                    System.out.println(a.toString());
                }
            }
        }

        @Override
        public void sortBy_ThirdCondition(Object obj) {

        }

        @Override
        public void sortBy_TwoConditions(Object dayOfWeek, Object departureTime) {
            for (AirLine a : airLines) {
                Pattern pattern = Pattern.compile((String) dayOfWeek);
                Matcher matcher = pattern.matcher(a.dayOfWeek);
                if (matcher.find()) {
                    if (a.departureTime > (double) departureTime) System.out.println(a.toString());
                }
            }
        }
    }
}
