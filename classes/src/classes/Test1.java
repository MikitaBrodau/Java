package classes;

//Task 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
//Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.
public class Test1 {
    private int variableOne;
    private int variableTwo;

    public int getVariableOne() {
        return variableOne;
    }

    public void setVariableOne(int variableOne) {
        this.variableOne = variableOne;
    }

    public int getVariableTwo() {
        return variableTwo;
    }

    public void setVariableTwo(int variableTwo) {
        variableTwo = variableTwo;
    }

    public Test1(int variableOne, int variableTwo) {
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
    }

    public Test1() {
    }

    @Override
    public String toString() {
        return "Test1: " + "variableOne = " + variableOne + ", VariableTwo= " + variableTwo;
    }

    public int summary() {
        return this.variableOne + this.variableTwo;
    }

    public int maxVariable() {
        return Math.max(this.variableOne, this.variableTwo);
    }
}
