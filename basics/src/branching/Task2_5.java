package branching;

public class Task2_5 {
    public void Task2_5(int x){
        double f;
        if(x <= 3){
            f = Math.pow(x,2) - (3*x) + 9;
            System.out.println(f);
        }
        if(x > 3){
            f = (1/(Math.pow(x,2) + 6));
            System.out.println(f);
        }
    }
}
