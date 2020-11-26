package linear.program;

public class Task1_2 {
    public void Task2(int a, int b, int c){
        double z = ((b+Math.sqrt(Math.pow(b,2) + 4*a*c))/2*a -Math.pow(a,3)*c + Math.pow(b,-2));
        System.out.println(z);
    }
}
