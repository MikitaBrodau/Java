package aggregation;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tour {
    private static int toursAmount = 1;
    private int tourId = toursAmount;
    private String hotelName;
    private float hotelRating;
    private int amountOfDays;
    private Transport transport;
    private TypeOfTrip typeOfTrip;
    private Food food;

    public Tour(String hotelName, float hotelRating, int amountOfDays, int transport, int typeOfTrip, int food) {
        this.hotelName = hotelName;
        this.hotelRating = hotelRating;
        this.amountOfDays = amountOfDays;
        this.transport = Transport.valueOf(transport);
        this.typeOfTrip = TypeOfTrip.valueOf(typeOfTrip);
        this.food = Food.valueOf(food);
        toursAmount++;
    }

    public Tour(String hotelName, float hotelRating, int amountOfDays, int typeOfTrip, int food) {
        this.hotelName = hotelName;
        this.hotelRating = hotelRating;
        this.amountOfDays = amountOfDays;
        this.typeOfTrip = TypeOfTrip.valueOf(typeOfTrip);
        this.food = Food.valueOf(food);
    }

    public Tour(String hotelName, float hotelRating, int amountOfDays, int transport) {
        this.hotelName = hotelName;
        this.hotelRating = hotelRating;
        this.amountOfDays = amountOfDays;
        this.transport = Transport.valueOf(transport);
    }

    public static List<Tour> sort(List<Tour> list){
        list.sort(Comparator.comparingInt(o -> o.amountOfDays));
        return list;
    }

    @Override
    public String toString() {
        return "Tour №" + tourId +
                "\thotel name: " + hotelName +
                "\thotelRating: " + hotelRating +
                "\tamountOfDays: " + amountOfDays +
                "\ttransport: " + transport +
                "\t" + typeOfTrip +
                "\tfood: " + food;
    }

    enum Transport{
        BUS(1, "Bus"),AIRPLANE(2, "Airplane"),CAR(3, "Car"),TRAIN(4, "Train");

        private final int transportId;
        private final String toString;

        Transport(int transportId, String toString) {
            this.transportId = transportId;
            this.toString = toString;
        }
        private static Transport valueOf(int transportId) {
            for (Transport transport : Transport.values()) {
                if (transport.transportId == transportId) {
                    return transport;
                }
            }
            throw new IllegalArgumentException("Wrong Transport");
        }

        @Override
        public String toString() {
            return toString;
        }
    }

    enum Food{
        ALL_IN(1, "All Inclusive"),BREAKFAST_ONLY(2, "Only Breakfast"), DINNER_ONLY(3, "Only Dinner");

        private final int foodId;
        private final String food;

        Food(int foodId, String food) {
            this.foodId = foodId;
            this.food = food;
        }
        private static Food valueOf(int foodId) {
            for (Food food : Food.values()) {
                if (food.foodId == foodId) {
                    return food;
                }
            }
            throw new IllegalArgumentException("Wrong Transport");
        }

        @Override
        public String toString() {
            return food ;
        }
    }

    enum TypeOfTrip{
        SHOPPING(1, "Shopping"), CRUISE(2, "Cruise"), EXCURSION(3, "Excursion"), RECOVERY(4, "Recovery"), REST(5, "Rest");
        private final int TypeId;
        private final String toString;

        TypeOfTrip(int typeId, String toString) {
            this.TypeId = typeId;
            this.toString = toString;
        }
        private static TypeOfTrip valueOf(int typeId) {
            for (TypeOfTrip typeOfTrip : TypeOfTrip.values()) {
                if (typeOfTrip.TypeId == typeId) {
                    return typeOfTrip;
                }
            }
            throw new IllegalArgumentException("Wrong Transport");
        }

        @Override
        public String toString() {
            return "Type of trip: " + toString;
        }
    }
}

