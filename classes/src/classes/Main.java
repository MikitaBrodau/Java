package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class Main {

    public static void main(String[] args) {
//        Test1 test1 = new Test1(8, 12); //task 1
//        System.out.println(test1.maxVariable());
//        System.out.println(test1.summary());
//
//        Test2 test2 = new Test2(); //task 2, he do nothing btw on that moment;
//
//        int[] forGoodStudent = {10,9,9,10,10};
//        List<Student> list = new ArrayList<>();
//        list.add(new Student("Alesha", "I,V", 3));
//        list.add(new Student("Drugoi Alesha", "X,V", 4));
//        list.add(new Student("ne Jenya", "C,V", 1));
//        list.add(new Student("IDEAL STUDENT","G.G", 12, forGoodStudent));
//        Student.academicGoodPerformance(list); //task 3
//
//
//        List<Train> trains = new ArrayList<>();
//        trains.add(new Train("GaaGa", 1, "12.43"));
//        trains.add(new Train("Moscow", 17, "10.43"));
//        trains.add(new Train("Minsk", 3, "16.34"));
//        trains.add(new Train("Minsk", 3, "23.00"));
//        System.out.println(trains.toString());
//        sort(trains);
//        System.out.println(Train.containsNumber(trains, 1));
//        CompareTrain compare = new CompareTrain();
//        trains.sort(compare);
//        System.out.println(trains.toString()); //task 4
//
//        Counter counter = new Counter(6,0, 10);
//        counter.counterIncrement();
//        counter.counterDecrement(); //task 5
//
//        Time time = new Time(22, 9 , 9);
//        System.out.println(time.toString());
//        time.setTime(11, 15, 0);
//        System.out.println(time.toString()); //task 6

//        Triangle triangle = new Triangle(7.8, 10, 12.4);
//        triangle.calculateMedian(triangle);
//        triangle.calculatePerimeter(triangle);
//        triangle.calculateSquare(triangle);
//        System.out.println(triangle.toString());

        Triangle triangle2 = new Triangle(new Coordinate(1,1),new Coordinate(2,5),new Coordinate(5,3));
        triangle2.calculateMedian(triangle2);
//        triangle2.calculatePerimeter(triangle2);
        triangle2.calculateSquare(triangle2);
        System.out.println(triangle2.toString()); //task 7

//        CustomerDatabase db = new CustomerDatabase();
//        db.addIn_DB(new Customer("Brodov", "Mikita", "Igorevich", "Belarus. Mogilev. Romanova 8-10",8000_7000_6000_5000L, "BY49RB539082112039"));
//        db.addIn_DB(new Customer("Makoveev", "Dzmitry", "Galikovich", "Belarus. Mogilev. Menzhinka 10-12",1042_1000_4000_3000L, "BY49RB553282112039"));
//        Collections.sort(db.get_DB());
//        db.sortBy_TwoConditions(8000_9000_0000_0000L, 4000_0000_0000_0000L); //task 8
//
//        BookDatabase books = new BookDatabase();
//        List<String> shelock = new ArrayList<>();
//        shelock.add("Arthur Konan Doil");
//        List<String> badCoder = new ArrayList<>();
//        badCoder.add("Brodov Mikita Igorevich");
//        books.addIn_DB(new Book("Sherlock Holmes",shelock, "KAKOI-TO", 1974, 500, 49.99, 1));
//        books.addIn_DB(new Book("BadCoder", badCoder, "Mom, dad", 1999, 21, 0.0f, 2));
//        books.sortBy_FirstCondition("Arthur");
//        books.sortBy_SecondCondition("KAKOI");
//        books.sortBy_ThirdCondition(1999);
//        System.out.println(books.get_DB().toString()); //task 9
//
//        AirLineDataBase airLines = new AirLineDataBase();
//        airLines.addIn_DB(new AirLine("Gaaga", 101, "Boeing", new Time(15,00), 3));
//        airLines.addIn_DB(new AirLine("Taiwan", 132, "Boeing", new Time(17,20), 3));
//        airLines.addIn_DB(new AirLine("Moscow", 133, "Boeing", new Time(12,00), 3));
//        airLines.sortBy_FirstCondition("Gaaga".toUpperCase());
//        airLines.sortBy_SecondCondition(1);
//        airLines.sortBy_TwoConditions(3, new Time(16,00)); //task 10
    }
}
