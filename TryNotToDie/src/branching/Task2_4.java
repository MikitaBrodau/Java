package branching;

public class Task2_4 {
    public void Task2_4(int x, int y, int z) {
        int a = 220;
        int b = 50;
        System.out.println(((x <= a && x <= b) && (z <= a && z <= b)) || ((a >= y && b >= y ) && (z <= a && z <= b)));
    }
}
