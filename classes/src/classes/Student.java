package classes;

import java.util.Arrays;
import java.util.List;

/* Task 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
номер группы, успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.*/
public class Student {
    private final String lastName;
    private final String initials;
    private final int group;
    private final int[] performance;

    public Student(String lastName, String initials, int group, int[] performance) {
        this.lastName = lastName;
        this.initials = initials;
        this.group = group;
        this.performance = performance;
    }

    @Override
    public String toString() {
            return "Student: " + lastName + " group " + group + " performance " + Arrays.toString(performance);
    }

    public Student(String lastName, String initials, int group) {
        this.lastName = lastName;
        this.initials = initials;
        this.group = group;
        this.performance = performanceRandom();
    }

    public static void academicGoodPerformance(List<Student> performance) {
        for (Student s : performance) {
            if (performanceCheck(s.performance))System.out.println("Good student: " + s.lastName + " from group number = " + s.group);
        }
    }
    private static boolean performanceCheck(int[] performance){
        for (int i = 0; i < performance.length; i++) {
            if (performance[i] != 9 && performance[i] != 10) return false;
        }
        return true;
    }

    public static int[] performanceRandom() {
        int[] performance = new int[5];
        for (int i = 0; i < performance.length; i++) {
            performance[i] = (int) (Math.floor(Math.random() * 10) + 1);
        }
        return performance;
    }
}
