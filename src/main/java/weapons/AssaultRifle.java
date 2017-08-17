package weapons;

public class AssaultRifle extends Weapon implements FireArms {
    public AssaultRifle() {
        super(5, 3, 30000);
    }

    @Override
    public int dealDistanceDamage(FightType fightType) {
        switch (fightType) {
            case MELEE:
                return getDamage() / 3;
            case GUNPLAY: return getDamage() * 3;
            default: throw new IllegalArgumentException();
        }
    }
}
