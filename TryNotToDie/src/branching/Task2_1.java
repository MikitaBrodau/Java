package branching;

public class Task2_1 {
    public void Task2_1(int a, int b){
        int c = 180 - (a + b);
        int sum = a + b + c;
        if (sum == 180){
            System.out.println("That triangle exist");
            if ( a == 90 || b == 90 || c == 90){
                System.out.println("The triangle is rectangular" + "\n also he have next degrees = "+ c +" "+ b +" " + a);
            }
        }
    }
}
