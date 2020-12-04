package classes;

import java.util.concurrent.TimeUnit;

/* Task 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его отдельных полей
(час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.*/
public class Time {
    private long totalSecs = 0;
    private long hours = 0;
    private long minutes = 0;
    private long seconds = 0;

    public Time(int hours, int minutes, int seconds){
        setHours(hours);
        setMinutes(minutes);
        this.totalSecs += seconds;
        calculate(this.totalSecs);
    }

    public Time(long hours, long minutes) {
        this.totalSecs = 0;
        this.totalSecs = totalSecs +hours*3600;
        this.totalSecs = totalSecs + minutes*60;
        calculate(this.totalSecs);
    }

    public long getHours() {
        return hours;
    }

    public long getMinutes() {
        return minutes;
    }

    public void setTime(long hours, long minutes, long seconds){
        this.totalSecs = 0;
        this.totalSecs = totalSecs +hours*3600;
        this.totalSecs = totalSecs + minutes*60;
        this.totalSecs += seconds;
        calculate(this.totalSecs);
    }

    public void setHours(long hours) {
        if (this.hours != 0) return;
        this.totalSecs = totalSecs +hours*3600;
    }

    public void setMinutes(long minutes) {
        if (this.minutes != 0) return;
        this.totalSecs = totalSecs + minutes*60;
    }

    private void calculate(long totalSecs){
        this.hours = totalSecs / 3600;
        this.minutes = (totalSecs % 3600) / 60;
        this.seconds = totalSecs % 60;
    }
    @Override
    public String toString() {
        if (minutes < 10 && seconds < 10) return hours + ":0" + minutes + ":0" + seconds;
        else if (seconds < 10) return hours + ":" + minutes + ":0" + seconds;
        else if (minutes < 10) return hours + ":0" + minutes + ":" + seconds;
        else return hours + ":" + minutes + ":" + seconds;
    }
}
