package classes;

import java.util.ArrayList;
import java.util.List;

/* Task 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.

Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/
public class Book {
    enum BooksCover {
        CARTON(1, "Carton"), SOFT_COVER(2, "Soft cover"), LEATHER(3, "Leather");

        private final int booksCoverId;
        private final String toString;

        BooksCover(int bookscoverId, String toString) {
            this.booksCoverId = bookscoverId;
            this.toString = toString;
        }

        private static Book.BooksCover valueOf(int booksCoverId) {
            for (Book.BooksCover booksCover : Book.BooksCover.values()) {
                if (booksCover.booksCoverId == booksCoverId) {
                    return booksCover;
                }
            }
            throw new IllegalArgumentException("Wrong Transport");
        }

        @Override
        public String toString() {
            return toString;
        }
    }

    private static int amount = 0;
    private int id;
    private String name;
    private List<String> authors;
    private String publishingHouse;
    private int year;
    private int pageAmount;
    private double price;
    private BooksCover cover;

    public Book(String name, List<String> authors, String publishingHouse, int year, int pageAmount, double price, int bookCoverId) {
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pageAmount = pageAmount;
        this.price = price;
        this.cover = BooksCover.valueOf(bookCoverId);
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

    public List<String> getAuthors() {
        return authors;
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


}
class BookDatabase {
    private List<Book> books = new ArrayList<>();

    public BookDatabase() {
    }

    public void addIn_DB(Object obj) {
        books.add((Book) obj);
    }

    public List<Book> get_DB() {
        return books;
    }

    public void sortBy_FirstCondition(String author) {
        for (Book b : books) {
            for (String s : b.getAuthors()) {
                if(s.equals(author)) System.out.println(b.toString());
            }
        }
    }

    public void sortBy_SecondCondition(String ph) {
        for (Book b : books) {
            if (b.getPublishingHouse().equals(ph)) {
                System.out.println(b.toString());
            }
        }
    }

    public void sortBy_ThirdCondition(int year) {
        for (Book b : books) {
            if (b.getYear() >= year) {
                System.out.println(b.toString());
            }
        }
    }
}

