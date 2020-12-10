package dragon.cave.treasures;

public class Gold extends Treasure {
    private final int totalPrice;
    private final int amount;

    public Gold(int price, String name, String description, int amount) {
        super(price, name, description);
        this.amount = amount;
        this.totalPrice = amount * price;
    }

    @Override
    public void showDescription() {
        System.out.println(getDescription());
    }

    @Override
    public String toString() {
        return super.toString() + "\tAmount: " + amount + "\tTotal price: " + totalPrice;
    }
}
