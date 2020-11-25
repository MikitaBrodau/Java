package aggregation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Text text = new Text(new Clause("How are you, my dear"), new Word("Friend?"));
//        System.out.println(text.toString()); //task 1
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

        CityList p = new CityList(new City("Warsaw",1_765_000, 517.2, true, true));
        p.cities.add(new City("Katowice", 302_397, 164.7, false, true));
        CityList c = new CityList(new City("Mogilev",380_440,118.5, false, true));
        c.cities.add(new City("Minsk",1_975_000,348.8, true, true));
        c.cities.add(new City("Babruysk",217_940, 90.02, false,false));
        RegionList regList = new RegionList(new Region("Belarus", c.cities));
        regList.regions.add(new Region("Poland", p.cities));
        Goverment goverment = new Goverment("POLSKA OKUPANTI", regList);
        System.out.println(goverment.toString()); //task 3
        System.out.println();
        goverment.regionCenters();
        goverment.capital();
        System.out.println(goverment.getAmountOfRegions());
    }
}
