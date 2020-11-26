package cycles;

import java.util.ArrayList;
import java.util.List;

public class Task3_2 {
    public List<Double> Task3_2(double a, double b, double h){
        List<Double> arr = new ArrayList<>();
        for (double x = a; x < b; x += h) {
            double y = 0;
            if(x>2){
                y = x;
            }
            else{
                y = -x;
            }
            arr.add(y);
        }
        return arr;
    }
}
