package File;

import java.util.List;
import java.util.Scanner;

/* Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.*/

public class Payment {
    private List<Product> payment;
    private int summaryPrice;

    class Product {
        private String name;
        private int price;
        private int amount;

        public Product(String name, int price,int amount) {
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
        int[]amount = new int[sc.nextInt()];
        for (int i = 0; i < amount.length; i++) {
            System.out.println("Product #"+(i+1)+" please set Name(first input), price(secondary input), amount(third input).");
            this.payment.add(new Product(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        calcSum(payment);
    }
    private void calcSum(List<Product> list){
        for (Product p : list) {
            this.summaryPrice += p.price * p.amount;
        }
    }
    public void printPayment(){
        System.out.println("======================================================================");
        for (Product p : payment) {
            System.out.println("Product name: " + p.name + "\tAmount " + p.amount + "\tTotal price = " + (p.price*p.amount));
        }
        System.out.println("======================================================================");
        System.out.println();
    }
}
