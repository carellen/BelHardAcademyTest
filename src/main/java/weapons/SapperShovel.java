package weapons;

public class SapperShovel extends Weapon implements SteelArms {

    public SapperShovel() {
        super(2, 2, 10000);
    }

    @Override
    public int dealMeleeDamage(FightType fightType) {
        switch (fightType) {
            case MELEE:
                return getDamage() * 2;
            case GUNPLAY: return 0; // no damage on distance
            default: throw new IllegalArgumentException();
        }
    }
}
