package File;


import gift.UserInteraction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory("./oop.basics/src/File/GodDamn");
        dir.getFilesIn().add(new File("God", ".json"));
        dir.getFilesIn().get(0).setDirectory(dir);
        dir.getFilesIn().get(0).setContent("Hello Jesus");
        dir.getFilesIn().get(0).getContent();
        dir.getFilesIn().add(new TextFile("AnotherGod"));
        dir.getFilesIn().get(1).setDirectory(dir);
        dir.getFilesIn().get(1).setContent("IM A GOD\nDon't tell to Kratos about it.");
        dir.getFilesIn().get(1).addContent("\nHALLO");
        dir.getFilesIn().get(1).getContent();
        System.out.println(dir.getFilesIn().get(1).getExtension());
        dir.getFilesIn().get(0).delete();
        dir.getFilesIn().get(1).setName("Jerotajhoeirt");

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

        List<Calendar.Holiday> holidays = new ArrayList<>();
        holidays.add(new Calendar.Holiday(false, true, "all man day", 2, 23));
        holidays.add(new Calendar.Holiday(false, true, "all lovers day", 2, 14));
        Calendar calendar = new Calendar(holidays);
        calendar.getHolidays().add(new Calendar.Holiday(true, true, "All womans day", 3, 8));
        System.out.println(calendar.getHolidayDay(3, 8));
        System.out.println(calendar.getHolidayDay(2, 23));
        System.out.println(calendar.getHolidayDay(2, 14));
    }
}
