package soldiers;

import weapons.Weapon;

import java.util.List;

public class General extends Sergeant implements Commander {

    private List<Soldier> subordinates;
    public General(Weapon primaryWeapon, Weapon secondaryWeapon) {
        super(primaryWeapon, secondaryWeapon);
        setStrength(10);
        setStamina(10);
    }

    public List<Soldier> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Soldier> subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public Order giveAnOrder() {
        return Order.values()[(int)(Math.random() * 3)]; //sometimes general`s logic looks like this))
    }

    @Override
    public void executeOrder(Order order) {
        switch (order) {
            case ATTACK:
                System.out.println(getClass().getSimpleName() + " is attacking and dealing damage " + getDamage());
                break;
            case RETREAT:
                System.out.println(getClass().getSimpleName() + " is NEVER retreating!Fight, you cowardly bastards!");
                break;
            case DIG_IN:
                System.out.println(getClass().getSimpleName() + " is thinking about strategy...");
                break;
            default:
                System.out.println("Wrong order. " + getClass().getSimpleName() + " is drinking brandy...");
        }
    }
}
