package classes;
/*Task 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
Написать код, демонстрирующий все возможности класса. */
public class Counter {
    private static int count;

    public int counterIncrement(){
        return ++count;
    }
    public int counterDecrement(){
        return --count;
    }
    public Counter() {
        count = 0;
    }
    public Counter(int n){
        count = n;
    }
    public int getCount() {
        return count;
    }
}
