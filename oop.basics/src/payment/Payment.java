package payment;

import gift.UserInteraction;

import java.util.ArrayList;
import java.util.List;

/* Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.*/

public class Payment {
    private List<Product> payment = new ArrayList<>();
    private int summaryPrice;
    private final UserInteraction userInteraction;

    public List<Product> getPayment() {
        return payment;
    }

    public UserInteraction getUserInteraction() {
        return userInteraction;
    }

    public void setPayment(List<Product> payment) {
        this.payment = payment;
    }

    public int getSummaryPrice() {
        return summaryPrice;
    }

    public void setSummaryPrice(int summaryPrice) {
        this.summaryPrice = summaryPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===================================================\n");
        for (Product p : payment) {
            sb.append("Product name: ").append(p.name).append("\tAmount ").append(p.amount).append("\tTotal price = ")
                    .append(p.price * p.amount).append("\n");
        }
        sb.append("===================================================\n");
        sb.append("Amount of payments: ").append(payment.size()).append("\tTotal price = ").append(summaryPrice).append('$');
        return sb.toString();
    }

    static class Product {
        private final String name;
        private final int price;
        private final int amount;

        public Product(String name, int price, int amount) {
            this.name = name;
            this.price = price;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Product name: " + name + "\tprice: " + price + '$';
        }
    }

    public Payment(UserInteraction userInteraction){
        this.userInteraction = userInteraction;
    }

    public Payment() {
        this.userInteraction = new UserInteraction();
    }

    private void calcSum (List < Product > list) {
            for (Product p : list) {
                this.summaryPrice += p.price * p.amount;
            }
    }

    public static void main(String[] args) {
        UserInteraction ui = new UserInteraction();
        Payment payment = new Payment(ui);
        while (true) {
            if (ui.requestContinue("Do you want continue?\"Y/N\"")) break;
            String name = ui.requestString("Name of product: ");
            int price = ui.requestInt("Price: ");
            int amount = ui.requestInt("Amount: ");
            payment.getPayment().add(new Payment.Product(name, price, amount));
        }
        System.out.println(payment.toString());
    }
}
