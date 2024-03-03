// Terran 종족 클래스

import java.util.ArrayList;
import java.util.List;

public class Terran {
    static List<Unit> units = new ArrayList<>();
    String raceName = "Terran";
    
    public static List<Unit> generateUnits() {
        units.add(new NonFlyingUnit("Marine", 3, 10, ""));
        units.add(new NonFlyingUnit("Tank", 7, 15, ""));
        units.add(new NonFlyingUnit("Goliath", 5, 15, "미사일"));
        units.add(new FlyingUnit("Wraith", 3, 10, ""));
        units.add(new FlyingUnit("Valkyrie", 4, 12, ""));
        return units;
    }
}