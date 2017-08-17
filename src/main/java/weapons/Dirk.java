package weapons;

public class Dirk extends Bayonet {
    public Dirk() {
        super();
        setPrice(15000);
    }

    @Override
    public int dealMeleeDamage(FightType fightType) {
        switch (fightType) {
            case MELEE:
                return getDamage() * 5;
            case GUNPLAY: return 0; // no damage on distance
            default: throw new IllegalArgumentException();
        }
    }
}
