package classes;
/* Task 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.

Найти и вывести:

a) список книг заданного автора;

b) список книг, выпущенных заданным издательством;

c) список книг, выпущенных после заданного года.*/

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Book {
    private static int amount = 0;
    private int id;
    private String name;
    private String authors;
    private String publishingHouse;
    private int year;
    private int pageAmount;
    private double price;
    private String cover;

    public Book(String name, String authors, String publishingHouse, int year, int pageAmount, double price, String cover) {
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pageAmount = pageAmount;
        this.price = price;
        this.cover = cover;
        amount++;
        this.id = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "\nBook " +
                "id = " + id +
                "\nname = " + name +
                "\nauthors = " + authors +
                "\npublishingHouse = " + publishingHouse +
                "\nyear = " + year +
                "\npageAmount = " + pageAmount +
                "\nprice = " + price + "$" +
                "\ncover = " + cover + "\n";
    }

    static class BookDatabase implements DataBase<Book> {
        private static final List<Book> books = new ArrayList<>();

        public BookDatabase() {
        }

        @Override
        public void addIn_DB(Object obj) {
            books.add((Book) obj);
        }

        @Override
        public List<Book> get_DB() {
            return books;
        }

        @Override
        public void sortBy_FirstCondition(Object author) {
            for (Book b : books) {
                Pattern pattern = Pattern.compile((String) author);
                Matcher matcher = pattern.matcher(b.authors);
                if (matcher.find()) {
                    System.out.println(b.toString());
                }
            }
        }

        @Override
        public void sortBy_SecondCondition(Object ph) {
            for (Book b : books) {
                Pattern pattern = Pattern.compile((String) ph);
                Matcher matcher = pattern.matcher(b.publishingHouse);
                if (matcher.find()) {
                    System.out.println(b.toString());
                }
            }
        }

        @Override
        public void sortBy_ThirdCondition(Object year) {
            for (Book b : books) {
                if (b.year >= (int) year) {
                    System.out.println(b.toString());
                }
            }
        }

        @Override
        public void sortBy_TwoConditions(Object o1, Object o2) {
        }
    }
}
