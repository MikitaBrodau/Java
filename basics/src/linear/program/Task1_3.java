package linear.program;

public class Task1_3 {
    public void Task3(double x, double y){
       Double z = (Math.sin(x)+Math.cos(y))/(Math.cos(x) - Math.sin(y))* Math.tanh(x*y);
       System.out.println(z);
    }
}
