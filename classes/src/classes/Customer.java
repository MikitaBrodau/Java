package classes;

import java.util.ArrayList;
import java.util.List;

/* Task 8.Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/
public class Customer implements Comparable<Customer> {
    private static int amount = 0;
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private long creditCardNumber;
    private String bankAccount;

    public Customer(String lastName, String firstName, String patronymic, String address, long creditCardNumber, String bankAccount) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccount = bankAccount;
        amount++;
        this.id = amount;
    }

    @Override
    public String toString() {
        return "Customer " +
                "\nlastName = " + lastName +
                "\nfirstName = " + firstName +
                "\npatronymic= " + patronymic +
                "\naddress = " + address +
                "\ncreditCardNumber = " + creditCardNumber +
                "\nbankAccount = " + bankAccount;
    }

    @Override
    public int compareTo(Customer o) {
        return this.lastName.compareTo(o.lastName);
    }

    public int getId() {
        return this.id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getLastName() {
        return lastName.toUpperCase();
    }

    public String getFirstName() {
        return firstName.toUpperCase();
    }

    public String getPatronymic() {
        return patronymic.toUpperCase();
    }

    public String getAddress() {
        return address.toUpperCase();
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getBankAccount() {
        return bankAccount.toUpperCase();
    }


}
class CustomerDatabase {
    private List<Customer> customers = new ArrayList<>();

    public void addIn_DB(Object customer) {
        customers.add((Customer) customer);
    }

    public List<Customer> get_DB() {
        return customers;
    }

    public void sortBy_TwoConditions(long o1, long o2) {
        for (Customer c : customers) {
            if (c.getCreditCardNumber() > o1 && c.getCreditCardNumber() < o2)
                System.out.println(c.toString());
        }
    }
}