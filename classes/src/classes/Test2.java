package classes;

/*Task 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.*/
public class Test2 {
    private int variableOne;
    private int variableTwo;

    public Test2(int variableOne, int variableTwo) {
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
    }

    public Test2() {
    }

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
        this.variableTwo = variableTwo;
    }
}
