package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class Main {

    public static void main(String[] args) {
        Test1 test1 = new Test1(8, 12); //task 1
        System.out.println(test1.maxVariable());
        System.out.println(test1.summary());

        Test2 test2 = new Test2(); //task 2, he do nothing btw on that moment;

        int[] forGoodStudent = {10,9,9,10,10};
        List<Student> list = new ArrayList<>();
        list.add(new Student("Alesha", "I,V", 3));
        list.add(new Student("Drugoi Alesha", "X,V", 4));
        list.add(new Student("ne Jenya", "C,V", 1));
        list.add(new Student("IDEAL STUDENT","G.G", 12, forGoodStudent));
        System.out.println(list.toString()); //task 3


        List<Train> trains = new ArrayList<>();
        trains.add(new Train("GaaGa", 1, "12.43"));
        trains.add(new Train("Moscow", 17, "10.43"));
        trains.add(new Train("Minsk", 3, "16.34"));
        trains.add(new Train("Minsk", 3, "23.00"));
        System.out.println(trains.toString());
        sort(trains);
        System.out.println(Train.containsNumber(trains, 1));
        CompareTrain compare = new CompareTrain();
        trains.sort(compare);
        System.out.println(trains.toString()); //task 4

        Counter counter = new Counter(6);
        counter.counterIncrement();
        counter.counterDecrement(); //task 5

        Time time = new Time(22, 9 , 9);
        System.out.println(time.toString());
        time.timeChange(11, 15, 0);
        System.out.println(time.toString()); //task 6

        Triangle triangle = new Triangle(7.8, 10, 12.4);
        triangle.calculateMedian(triangle);
        triangle.calculatePerimeter(triangle);
        triangle.calculateSquare(triangle);
        System.out.println(triangle.toString());

        Triangle triangle2 = new Triangle(15, 8, 22.45);
        triangle2.calculateMedian(triangle2);
        triangle2.calculatePerimeter(triangle2);
        triangle2.calculateSquare(triangle2);
        System.out.println(triangle2.toString()); //task 7

        Customer.CustomerDatabase db = new Customer.CustomerDatabase();
        db.addIn_DB(new Customer("Brodov", "Mikita", "Igorevich", "Belarus. Mogilev. Romanova 8-10",8000_7000_6000_5000L, "BY49RB539082112039"));
        db.addIn_DB(new Customer("Makoveev", "Dzmitry", "Galikovich", "Belarus. Mogilev. Menzhinka 10-12",1042_1000_4000_3000L, "BY49RB553282112039"));
        Collections.sort(db.get_DB());
        db.sortBy_TwoConditions(8000_9000_0000_0000L, 4000_0000_0000_0000L); //task 8

        Book.BookDatabase books = new Book.BookDatabase();
        books.addIn_DB(new Book("Sherlock Holmes","Arthur Konan Doil", "KAKOI-TO", 1974, 500, 49.99, "Leather"));
        books.addIn_DB(new Book("BadCoder", "Brodov Mikita Igorevich", "Mom, dad", 1999, 21, 0.0f, "Leather"));
        books.sortBy_FirstCondition("Arthur");
        books.sortBy_SecondCondition("KAKOI");
        books.sortBy_ThirdCondition(1999);
        System.out.println(books.get_DB().toString()); //task 9

        AirLine.AirLineDataBase airLines = new AirLine.AirLineDataBase();
        airLines.addIn_DB(new AirLine("Gaaga", 101, "Boeing", 13.45, "Monday"));
        airLines.addIn_DB(new AirLine("Taiwan", 132, "Boeing", 13.22, "Tuesday"));
        airLines.addIn_DB(new AirLine("Moscow", 133, "Boeing", 17.43, "Tuesday"));
        airLines.sortBy_FirstCondition("Gaaga".toUpperCase());
        airLines.sortBy_SecondCondition("Tuesday".toUpperCase());
        airLines.sortBy_TwoConditions("Tuesday".toUpperCase(), 16.00); //task 10
    }
}
