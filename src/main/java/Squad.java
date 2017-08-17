import soldiers.General;
import soldiers.PrivateS;
import soldiers.Sergeant;
import soldiers.Soldier;
import weapons.*;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private final List<Soldier> soldierList = new ArrayList<>();

    {

        soldierList.add(new PrivateS(new AssaultRifle(), new SapperShovel()));
        soldierList.add(new PrivateS(new AssaultRifle(), new SapperShovel()));
        soldierList.add(new PrivateS(new AssaultRifle(), new SapperShovel()));
        soldierList.add(new PrivateS(new AssaultRifle(), new SapperShovel()));
        soldierList.add(new Sergeant(new HandGun(), new Bayonet()));
        soldierList.add(new General(new HandGun(), new Dirk()));
    }

    public int getTotalWeaponsWeight() {
        return soldierList.stream().mapToInt(Soldier::getWeaponsWeight).sum();
    }

    public int getTotalWeaponsPrice() {
        return soldierList.stream().mapToInt(Soldier::getWeaponsPrice).sum();
    }

    public List<Soldier> getSoldierList() {
        return soldierList;
    }
}
