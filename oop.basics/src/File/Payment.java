package File;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

/* Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.*/

public class Payment {
    private List<Product> payment = new ArrayList<>();
    private int summaryPrice;

    public List<Product> getPayment() {
        return payment;
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
        return "Payment: " + payment +
                "\n\tsummaryPrice=" + summaryPrice +'$';
    }

    static class Product {
        private String name;
        private int price;
        private int amount;

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

    public Payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, set amount of payments");
        try {
            int[] size = new int[sc.nextInt()];
            for (int p : size) {
                System.out.print("Name of position: ");
                String name = sc.next();
                System.out.print("Price: ");
                int price = sc.nextInt();
                System.out.print("Amount: ");
                int amount = sc.nextInt();
                payment.add(new Product(name, price, amount));
                this.summaryPrice += price*amount;
            }
        } catch (NumberFormatException e) {
            System.out.println("Number format Exception. Please try again.");
        } catch (NegativeArraySizeException e) {
            System.out.println("You can't set negative arr size");
        } catch (NullPointerException e) {
            System.out.println("Array is not exist");
        }
    }


    public void printPayment() {
        System.out.println("======================================================================");
        for (Product p : payment) {
            System.out.println("Product name: " + p.name + "\t\tAmount " + p.amount + "\tTotal price = " + (p.price * p.amount));
        }
        System.out.println("======================================================================");
        System.out.println("Amount of payments: " + payment.size() + "\tTotal price = " + summaryPrice + '$');
    }
}
