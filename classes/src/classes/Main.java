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
//        Student student1 = new Student("Alesha", "I,V", 3);
//        Student student2 = new Student("Drugoi Alesha", "X,V", 4);
//        Student student6 = new Student("ne Jenya", "C,V", 1);
//        Student student7 = new Student("IDEAL STUDENT","G.G", 12, forGoodStudent);
//        List<Student> list = new ArrayList<>();
//        list.add(student7);
//        list.add(student6);
//        list.add(student1);
//        list.add(student2);
//        System.out.println(list.toString());

        Train train1 = new Train("GaaGa", 1, "12.43");
        Train train2 = new Train("Moscow", 17, "10.43");
        Train train3 = new Train("Minsk", 3, "16.34");
        Train train4 = new Train("Minsk", 3, "23.00");
        List<Train> trains = new ArrayList<>();
        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        System.out.println(trains.toString());
        sort(trains);
        System.out.println(Train.containsNumber(trains, 1));
        CompareTrain compare = new CompareTrain();
        trains.sort(compare);
        System.out.println(trains.toString());
    }
}
