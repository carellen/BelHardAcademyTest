package weapons;

public abstract class Weapon {
    private int damage;
    private int weight;
    private int price; // in cents, because of problem with double counting

    public Weapon(int damage, int weight, int price) {
        this.damage = damage;
        this.weight = weight;
        this.price = price;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "damage=" + damage +
                ", weight=" + weight +
                ", price=" + String.format("%.2f USD", (float)price/100)  +
                '}';
    }
}
