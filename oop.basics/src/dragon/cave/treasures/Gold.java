package dragon.cave.treasures;

public class Gold extends Treasure {
    private final int totalPrice;
    private final int amount;

    public Gold(int price, String name, int amount) {
        super(price, name);
        this.amount = amount;
        this.totalPrice = amount;
    }

    @Override
    public String toString() {
        return super.toString() + "\tAmount: " + amount + "\tTotal price: " + totalPrice;
    }
}
