package classes;

/*Task 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
Написать код, демонстрирующий все возможности класса. */
public class Counter {
    private int count;
    private int min;
    private int max;

    public void counterIncrement() {
        if (checkInterval(count, min, max)) ++count;
        else {
            System.out.println("Currently you cant increase your counter, cause in that case is gonna be higher then maximum value");
        }
    }

    public void counterDecrement() {
        if (checkInterval(count, min, max)) --count;
        else {
            System.out.println("Currently you cant decrease your counter, cause in that case is gonna be lower then minimal value");
        }
    }

    public Counter() {
        count = 0;
    }

    public Counter(int n, int min, int max) {
        if (checkInterval(n, min, max)) {
            count = n;
        }
        else{
            throw new ArithmeticException("Invalid input");
        }
        this.min = min;
        this.max = max;
    }

    public int getCount() {
        return count;
    }

    private boolean checkInterval(int n, int min, int max) {
        return n >= min && n <= max;
    }
}
