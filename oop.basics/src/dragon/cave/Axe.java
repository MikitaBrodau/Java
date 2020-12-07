package dragon.cave;

public class Axe extends Treasure{
    public Axe(int price, String name, int dmg, String description) {
        super(price, name, dmg, description);
    }

    @Override
    public void showDescription() {
        System.out.println(getDescription());
    }
}
