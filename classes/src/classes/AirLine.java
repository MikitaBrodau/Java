package classes;
/* Task 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

Найти и вывести:

a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AirLine {

    private String destination;
    private int flightId;
    private String aircraftType;
    private Time departureTime;
    private DayOfWeek dayOfWeek;

    public AirLine(String destination, int flightId, String aircraftType, Time departureTime, int dayOfWeek) {
        this.destination = destination.toUpperCase();
        this.flightId = flightId;
        this.aircraftType = aircraftType.toUpperCase();
        this.departureTime = departureTime;
        this.dayOfWeek = setDayOfWeek(dayOfWeek);
    }

    private DayOfWeek setDayOfWeek(int i) {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.getValue() == i) {
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("Wrong day of week");
    }

    public String getDestination() {
        return destination;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
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
}

class AirLineDataBase {
    private static final List<AirLine> airLines = new ArrayList<>();

    public AirLineDataBase() {
    }

    public void addIn_DB(Object obj) {
        airLines.add((AirLine) obj);
    }

    public List<AirLine> get_DB() {
        return airLines;
    }

    public void sortBy_FirstCondition(String destination) {
        for (AirLine a : airLines) {
            if (a.getDestination().equals(destination)) {
                System.out.println(a.toString());
            }
        }
    }

    public void sortBy_SecondCondition(int dayOfWeek) {
        for (AirLine a : airLines) {
            if (a.getDayOfWeek().getValue() == dayOfWeek) {
                System.out.println(a.toString());
            }
        }
    }

    public void sortBy_TwoConditions(int dayOfWeek, Time time) {
        for (AirLine a : airLines) {
            if(a.getDayOfWeek().getValue() == dayOfWeek){
                if (a.getDepartureTime().getHours() > time.getHours()) System.out.println(a.toString());
                else if(a.getDepartureTime().getHours() == time.getHours()){
                    if (a.getDepartureTime().getMinutes() > time.getMinutes()) System.out.println(a.toString());
                }
            }
        }
    }
}