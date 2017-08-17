package weapons;

public class Bayonet extends Weapon implements SteelArms {
    public Bayonet() {
        super(3, 1, 5000);
    }

    @Override
    public int dealMeleeDamage(FightType fightType) {
        switch (fightType) {
            case MELEE:
                return getDamage() * 3;
            case GUNPLAY: return 0; // no damage on distance
            default: throw new IllegalArgumentException();
        }
    }
}
