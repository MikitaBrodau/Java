package aggregation;


import java.time.Year;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.*/
public class ClientAccount implements ClientsAccountManage<Card> {
    private final long clientID;
    private String firstName;
    private String lastName;
    public List<Card> personalCards = new ArrayList<>();


    public ClientAccount(String firstName, String lastName, long clientID) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
        this.clientID = clientID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getClientID() {
        return clientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public List<Card> getPosBalance() {
        List<Card> posBalance = new ArrayList<>();
        for (Card c : personalCards) {
            if (c.getBalance() > 0)
                posBalance.add(c);
        }
        return posBalance;
    }

    @Override
    public List<Card> getNegBalance() {
        List<Card> negBalance = new ArrayList<>();
        for (Card c : personalCards) {
            if (c.getBalance() < 0) {
                negBalance.add(c);
            }
        }
        return negBalance;
    }

    @Override
    public double getAllCardBalance() {
        double sum = 0;
        for (Card c : personalCards) {
            sum += c.getBalance();
        }
        System.out.println("Current all of cards balance: " + sum);
        return sum;
    }

    @Override
    public void sortCardsByBalance() {
        personalCards.sort(Card::compareTo);
    }

    @Override
    public void searchByBalanceInterval(int min, int max) {
        for (Card c : personalCards) {
            if (c.getBalance() > min && c.getBalance() < max) {
                System.out.println("Your card: " + c.toString());
            }
        }
    }

    @Override
    public void searchByValueType(String type) {
        for (Card c : personalCards) {
            if (c.getValueType().equals(type.toUpperCase()))
                System.out.println("Your card: " + c.toString());
        }
    }

    @Override
    public String toString() {
        return "clientID: " + clientID +
                "\tfirstName: " + firstName +
                "\tlastName: " + lastName;
    }
}

class Cash {
    private double amountOfCash;
    private final String valueType;

    public Cash(double amountOfCash, String valueType) {
        if (valueType.length() > 3) throw new IllegalArgumentException("Value type should content only 3 letters");
        this.amountOfCash = amountOfCash;
        this.valueType = valueType;
    }

    public void makeValueReplenishment(Card card, double howMuch) {
        if (card.getValueType().equals(this.valueType)) {
            if (howMuch <= amountOfCash) {
                card.setAmountOfCurrency(howMuch);
                this.amountOfCash -= howMuch;
            }
        }
    }
}

class Card implements Comparable<Card> {
    private final long cardID;
    private final short cvv;
    private final String duration;
    private double balance;
    private final String valueType;
    private boolean locked;

    public Card(String valueType) {
        if (valueType.length() > 4) throw new IllegalArgumentException("Value type should content only 3 letters");
        this.cardID = (long) (1000_0000_0000_0000L + Math.floor(Math.random() * 7000_0000_0000_0000L));
        this.cvv = (short) Math.floor(Math.random() * 999);
        this.duration = setDuration();
        this.valueType = valueType.toUpperCase();
    }

    public Card(String valueType, double balance) {
        if (valueType.length() > 4) throw new IllegalArgumentException("Value type should content only 3 letters");
        this.cardID = (long) (1000_0000_0000_0000L + Math.floor(Math.random() * 7000_0000_0000_0000L));
        this.cvv = (short) Math.floor(Math.random() * 999);
        this.duration = setDuration();
        this.valueType = valueType.toUpperCase();
        this.balance = balance;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public double getBalance() {
        if (!locked) return balance;
        else return 0;
    }

    public void setAmountOfCurrency(double amountOfCurrency) {
        if (!locked)
            this.balance += amountOfCurrency;
    }

    public String getValueType() {
        if (!locked) return valueType;
        else return "Your card is locked";
    }

    public String setDuration() {
        Date date = new Date();
        Pattern pattern = Pattern.compile("\\w{3}\\s\\d{2}");
        Matcher matcher = pattern.matcher(date.toString());
        StringBuilder sb = new StringBuilder();
        int year = Year.now().getValue() - 2000;
        if (matcher.find()) sb.append(matcher.group());
        return sb.toString() + "/" + (year + 4);
    }

    @Override
    public int compareTo(Card c) {
        return (int) ((int) c.getBalance() - this.balance);
    }

    @Override
    public String toString() {
        if (!locked) return "cardID: " + cardID +
                "\tcvv: " + cvv +
                "\tBalance: " + balance +
                "\tDuration until: " + duration + "\n";
        else return "You card is locked";
    }
}