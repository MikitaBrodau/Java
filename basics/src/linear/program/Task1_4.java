package linear.program;
public class Task1_4 {
    public void Task4(double a){
        String s = String.valueOf(a);
        String[] arr = s.split("\\.");
        System.out.println(arr[1] + "." + arr[0]);
    }
}
