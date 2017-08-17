package soldiers;

import weapons.Weapon;

public class PrivateS extends Soldier {


    public PrivateS(Weapon primaryWeapon, Weapon secondaryWeapon) {
        super(primaryWeapon, secondaryWeapon);
        setStrength(10);
        setStamina(15);
    }

    @Override
    public void executeOrder(Order order) {
        switch (order) {
            case ATTACK:
                System.out.println(getClass().getSimpleName() + " is attacking and dealing damage " + getDamage());
                break;
            case RETREAT:
                System.out.println(getClass().getSimpleName() + " is retreating...");
                break;
            case DIG_IN:
                System.out.println(getClass().getSimpleName() + " is digging in...");
                break;
                default:
                    System.out.println("Wrong order. " + getClass().getSimpleName() + " is sleeping...");
        }
    }
}
