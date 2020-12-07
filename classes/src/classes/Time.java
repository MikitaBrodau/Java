package classes;

import java.util.concurrent.TimeUnit;

/* Task 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его отдельных полей
(час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.*/
public class Time {
    private long totalSecs = 0;

    public Time(int hours, int minutes, int seconds) {
        this.totalSecs += seconds + (minutes*60) +(hours*3600);
    }

    public Time(long hours, long minutes) {
        this.totalSecs += (minutes*60) +(hours*3600);
   
    }

    public long getHours() {
        return calcHours();
    }

    public long getMinutes() {
        return calcMinutes();
    }

    public void setTime(long hours, long minutes, long seconds) {
        this.totalSecs += seconds + (minutes*60) +(hours*3600);
    }

    public void setHours(long hours) {
        if (calcHours() != 0) return;
        this.totalSecs = totalSecs + hours * 3600;
    }

    public void setMinutes(long minutes) {
        if (calcMinutes() != 0) return;
        this.totalSecs = totalSecs + minutes * 60;
    }

    private long calcHours() {
        if ((totalSecs / 3600) < 23) {
            return (totalSecs / 3600);
        } else return (totalSecs / 3600)%23;
    }

    private long calcMinutes() {
        return (totalSecs % 3600) / 60;
    }

    private long calcSeconds(){
        return totalSecs%60;
    }
    private String check(Long time){
        if (time<10){
            return "0"+time;
        }
        else return String.valueOf(time);
    }

    @Override
    public String toString() {
        return check(calcHours()) + ":" + check(calcMinutes()) + ":" + check(calcSeconds());
    }
}
