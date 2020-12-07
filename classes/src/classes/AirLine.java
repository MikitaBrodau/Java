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
    private final List<AirLine> airLines = new ArrayList<>();

    public AirLineDataBase() { }

    public List<AirLine> getDB() {
        return airLines;
    }

    public List<AirLine> sortByFirstCondition(String destination) {
        List<AirLine> list = new ArrayList<>();
        for (AirLine a : airLines) {
            if (a.getDestination().equals(destination)) {
                list.add(a);
            }
        }
        return list;
    }

    public List<AirLine> sortBySecondCondition(int dayOfWeek) {
        List<AirLine> list = new ArrayList<>();
        for (AirLine a : airLines) {
            if (a.getDayOfWeek().getValue() == dayOfWeek) {
                list.add(a);
            }
        }
        return list;
    }

    public List<AirLine> sortByTwoConditions(int dayOfWeek, Time time) {
        List<AirLine> list = new ArrayList<>();
        for (AirLine a : airLines) {
            if(a.getDayOfWeek().getValue() == dayOfWeek){
                if (a.getDepartureTime().getHours() > time.getHours()){
                    list.add(a);
                }
                else if(a.getDepartureTime().getHours() == time.getHours()){
                    if (a.getDepartureTime().getMinutes() > time.getMinutes())
                    {
                        list.add(a);
                    }
                }
            }
        }
        return list;
    }
}