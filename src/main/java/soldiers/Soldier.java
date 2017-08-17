package soldiers;

import weapons.Weapon;

public abstract class Soldier {
    private Weapon primaryWeapon;
    private Weapon secondaryWeapon;
    private int strength = 5;
    private int stamina = 5;
    public int getDamage() {
        return getStamina() * (getStrength() / getWeaponsWeight());
    }
    public int getWeaponsWeight() {
        return getPrimaryWeapon().getWeight() + getSecondaryWeapon().getWeight();
    }

    public int getWeaponsDamage() {
        return primaryWeapon.getDamage() + secondaryWeapon.getDamage();
    }

    public int getWeaponsPrice() {
        return primaryWeapon.getPrice() + secondaryWeapon.getPrice();
    }


    public Soldier(Weapon primaryWeapon, Weapon secondaryWeapon) {
        this.primaryWeapon = primaryWeapon;
        this.secondaryWeapon = secondaryWeapon;
        System.out.println("New " + getClass().getSimpleName() + " was created and armed with " + primaryWeapon + " and " + secondaryWeapon);

    }

    public abstract void executeOrder(Order order);

    public Weapon getPrimaryWeapon() {
        return primaryWeapon;
    }

    public void setPrimaryWeapon(Weapon primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public Weapon getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public void setSecondaryWeapon(Weapon secondaryWeapon) {
        this.secondaryWeapon = secondaryWeapon;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "primaryWeapon=" + primaryWeapon +
                ", secondaryWeapon=" + secondaryWeapon +
                ", strength=" + strength +
                ", stamina=" + stamina +
                '}';
    }
}
