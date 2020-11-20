package classes;

/* Task 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его отдельных полей
(час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.*/
public class Time {
    private int hours;
    private int minutes;
    private int seconds;


    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void timeChange(int hours, int minutes, int seconds){
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) {
        if (hours > 23) this.hours = 0;
        else this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes > 59) this.minutes = 0;
        else this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds > 59) this.seconds = 0;
        else this.seconds = seconds;
    }

    @Override
    public String toString() {
        if (minutes < 10 && seconds < 10) return hours + ":0" + minutes + ":0" + seconds;
        else if (seconds < 10) return hours + ":" + minutes + ":0" + seconds;
        else if (minutes < 10) return hours + ":0" + minutes + ":" + seconds;
        else return hours + ":" + minutes + ":" + seconds;
    }
}
