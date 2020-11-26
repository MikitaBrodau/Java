package classes;

import java.util.Arrays;

/* Task 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
номер группы, успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Student {
    private String lastName;
    private String initials;
    private int group;
    private int[] performance;

    public Student(String lastName, String initials, int group, int[] performance) {
        this.lastName = lastName;
        this.initials = initials;
        this.group = group;
        this.performance = performance;
    }

    @Override
    public String toString() {
        if (academicGoodPerformance(this.performance))
            return "Good Student " + "lastName = " + lastName + '\'' + " group " + group + " performance " + Arrays.toString(performance);
        else
            return "That was bad one = " + lastName + '\'' + " group " + group + " performance " + Arrays.toString(performance);
    }

    public Student(String lastName, String initials, int group) {
        this.lastName = lastName;
        this.initials = initials;
        this.group = group;
        this.performance = performanceRandom();
    }

    private static boolean academicGoodPerformance(int[] performance) {
        for (int i = 0; i < performance.length; i++) {
            if (performance[i] < 9) return false;
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
