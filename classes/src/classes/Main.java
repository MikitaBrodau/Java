package classes;

import java.util.ArrayList;
import java.util.Arrays;
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

//        int[] forGoodStudent = {10,9,9,10,10};
//        List<Student> list = new ArrayList<>();
//        list.add(new Student("Alesha", "I,V", 3));
//        list.add(new Student("Drugoi Alesha", "X,V", 4));
//        list.add(new Student("ne Jenya", "C,V", 1));
//        list.add(new Student("IDEAL STUDENT","G.G", 12, forGoodStudent));
//        System.out.println(list.toString());


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
        System.out.println(trains.toString());
    }
}
