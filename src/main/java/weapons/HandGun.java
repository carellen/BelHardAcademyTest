package weapons;

public class HandGun extends Weapon implements FireArms {
    public HandGun() {
        super(3, 1, 15000);
    }

    @Override
    public int dealDistanceDamage(FightType fightType) {
        switch (fightType) {
            case MELEE:
                return getDamage() / 2;
            case GUNPLAY: return getDamage() * 2;
            default: throw new IllegalArgumentException();
        }
    }
}
