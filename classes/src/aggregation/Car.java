package aggregation;

import java.util.Arrays;

/* Task 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/
public class Car {
    private String brand;
    private String type;
    private int price;
    private Engine engine;
    private SetOfWheels wheels;
    private int fuel = 10;

    public Car(String brand, String type, int price, Engine engine, SetOfWheels wheels) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "\nCar" + "\t" +
                "\t\tbrand: " + brand + "\t" +
                "\ttype: " + type + "\t" +
                "\tprice: " + price + "$" + "\t" +
                "\tFuel level = " + fuel +
                "\nengine: " + engine +
                "\nwheels: " + wheels;
    }

    public void refuel(int fuel) {
        if (fuel > 60) fuel = 60;
        else this.fuel = fuel;
        System.out.println("Now your fuel level: " + fuel);
    }

    public void wheelChange(SetOfWheels wheels) {
        this.wheels = wheels;
    }

    public void ride() {
        if (this.fuel == 0) System.out.println("Sorry, ur fuel tank is empty");
        else if (this.fuel > 0) {
            System.out.println("you driving");
            this.fuel -= Math.floor(Math.random()*10);
            System.out.println("Now your fuel level: " + this.fuel);
        }
    }
}

class Engine {
    private int horsePower;
    private String brand;
    private String model;

    public Engine(int horsePower, String brand, String model) {
        this.horsePower = horsePower;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "\t" + brand + " " + model + "\t\tPower: " + horsePower;
    }
}

class Wheel {
    private String seasonType;
    private int Size;
    private int wideOfWheel;

    public Wheel(String seasonType, int size, int wideOfWheel) {
        this.seasonType = seasonType;
        Size = size;
        this.wideOfWheel = wideOfWheel;
    }

    @Override
    public String toString() {
        return "\tSeason usage: " + seasonType + "\tSize: " + Size + "\tWheel wide: " + wideOfWheel;
    }
}

class SetOfWheels {
    private Wheel[] wheels = new Wheel[3];
    private Wheel wheel;

    public SetOfWheels(Wheel wheel) {
        this.wheel = wheel;
        Arrays.fill(this.wheels, wheel);
    }

    @Override
    public String toString() {
        return wheel.toString();
    }
}