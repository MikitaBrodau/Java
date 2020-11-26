package linear.program;

public class Task1_5 {
    public void Task5 (int a){
        int totalSecs = a;
        int hours = totalSecs / 3600;
        int minutes = (totalSecs % 3600) / 60;
        int seconds = totalSecs % 60;
        String time;
        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));

    }
}
