package aggregation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Text.Word> words = new ArrayList<>();
        List<Text.Clause> list = new ArrayList<>();
        words.add(new Text.Word("Hey,"));
        words.add(new Text.Word(" you?"));
        list.add(new Text.Clause(words));
        Text text = new Text(list);
        text.addSmthInText(new Text.Word("hello"), 0);
        System.out.println(text.toString()); //task 1
//
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("Mercedes", "Sedan", 20_000, new Engine(600, "SomeBrand", "3250"), new SetOfWheels(new Wheel("Winter",18,10))));
//        cars.add(new Car("Renault", "Cabriolet", 15_000, new Engine(400, "Titan", "6000"), new SetOfWheels(new Wheel("Summer",17,8))));
//        for (Car c : cars) {
//            System.out.println(c.toString());
//        }
//        cars.get(1).wheelChange(new SetOfWheels(new Wheel("Spring", 16,9)));
//        cars.get(0).refuel(40);
//        cars.get(0).ride(); //task 2
//
//        List<City> cityList = new ArrayList<>();
//        cityList.add(new City("Warsaw",1_765_000, 517.2, true, true));
//        cityList.add(new City("Katowice", 302_397, 164.7, false, true));
//        cityList.add(new City("Mogilev",380_440,118.5, false, true));
//        cityList.add(new City("Minsk",1_975_000,348.8, true, true));
//        cityList.add(new City("Babruysk",217_940, 90.02, false,false));
//        List<District> districtList = new ArrayList<>();
//        districtList.add(new District("Poland", cityList));
//        List<Region> regionList = new ArrayList<>();
//        regionList.add(new Region("POLSKA", districtList));
//        Goverment goverment = new Goverment("POLSKA OKUPANTI", regionList);
//        System.out.println(goverment.toString()); //task 3
//        System.out.println();

//
//        ClientAccount clientAccount = new ClientAccount("Mikita", "Brodau");
//        clientAccount.personalCards.add(new Card("BYN", 30.15));
//        clientAccount.personalCards.add(new Card("usd", -230.45));
//        clientAccount.personalCards.add(new Card("rub", 56_000));
//        clientAccount.personalCards.add(new Card("eur", 290.30));
//        clientAccount.personalCards.add(new Card("UAH", -1000.24));
//        clientAccount.personalCards.get(3).setLocked(true);
//        clientAccount.personalCards.get(0).setBalance(30000);
//        System.out.println(clientAccount.personalCards.toString());
//        clientAccount.getNegBalance();
//        clientAccount.getPosBalance();
//        clientAccount.getAllCardBalance();
//        clientAccount.sortCardsByBalance();
//        clientAccount.searchByBalanceInterval(-1200, 300);
//        System.out.println(clientAccount.personalCards.toString());
//        System.out.println(clientAccount.toString());

//        List<Tour> list = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        list.add(new Tour("Gaaga", (float) 10, 7, 1, 1, 1));
//        list.add(new Tour("Taiwan", (float) 3, 14, 1, 1, 3));
//        list.add(new Tour("Tokyo", (float) 4, 10, 1, 5, 1));
//        list.add(new Tour("Krakow", (float) 3.7, 14, 1, 3, 2));
//        list.add(new Tour("Izolyator", (float) 0.5, 15, 1, 2));
//        list.add(new Tour("Urugwai", (float) 4.7, 3, 3, 3, 1));
//        list.add(new Tour("Uganda", (float) 4.8, 21, 2, 4, 3));
//        Tour.sort(list);
//        for (Tour t : list) {
//            System.out.println(t.toString());
//        }
//        System.out.println("Please, choice your tour :)");
//        System.out.println("Your pick is: " + list.get(sc.nextInt()-1));
//        System.out.println("Have a good day");
    }
}
