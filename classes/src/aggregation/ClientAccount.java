package aggregation;


import java.math.BigDecimal;
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

    public Card byLast4Numbers(String numbers) {
        for (Card c : personalCards) {
            Pattern pattern = Pattern.compile("\\d{12}" + Pattern.quote(numbers) + "$");
            Matcher matcher = pattern.matcher(c.getCardNumber());
            if (matcher.find()) {
                return c;
            }
        }
        throw new IllegalArgumentException("Smth wrong");
    }

    @Override
    public List<Card> getPosBalance() {
        List<Card> posBalance = new ArrayList<>();
        for (Card c : personalCards) {
            if (c.getBalance() > 0) {
                posBalance.add(c);
            }
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
        personalCards.sort(Comparator.comparing(Card::getBalance));
    }

    @Override
    public void searchByBalanceInterval(double min, double max) {
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

class Card {
    private final String cardNumber;
    private final short cvv;
    private BigDecimal balance;
    private final String currency;
    private boolean locked;

    public Card(String valueType) {
        if (valueType.length() > 4) throw new IllegalArgumentException("Value type should content only 3 letters");
        this.cardNumber = genCardNumber();
        this.cvv = (short) Math.floor(Math.random() * 999);
        this.currency = valueType.toUpperCase();
    }

    public Card(String valueType, BigDecimal balance) {
        if (valueType.length() > 4) throw new IllegalArgumentException("Value type should content only 3 letters");
        this.cardNumber = genCardNumber();
        this.cvv = (short) Math.floor(Math.random() * 999);
        this.currency = valueType.toUpperCase();
        this.balance = balance;
    }

    public Card(String cardNumber, short cvv, BigDecimal balance, String currency) {
        this.cardNumber = cardNumber.trim().replaceAll("\s+", "");
        this.cvv = cvv;
        this.balance = balance;
        this.currency = currency;
    }

    private String genCardNumber() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append((1000 + (int) (Math.random() * 8999)));
        }
        return sb.toString();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public double getBalance() {
        if (!locked) return balance.doubleValue();
        else return 0;
    }

    public void setAmountOfCurrency(BigDecimal amountOfCurrency) {
        if (!locked) {
            balance = balance.add(amountOfCurrency);
        }
    }

    public String getValueType() {
        if (!locked) return currency;
        else return "Your card is locked";
    }

    @Override
    public String toString() {
        if (!locked) return "cardID: " + cardNumber +
                "\tcvv: " + cvv +
                "\tBalance: " + balance;
        else return "You card is locked";
    }
}