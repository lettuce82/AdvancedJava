// Protos 종족 클래스

import java.util.ArrayList;
import java.util.List;

public class Protos {
    static List<Unit> units = new ArrayList<>();
    String raceName = "Protos";

    public static List<Unit> generateUnits() {
        units.add(new NonFlyingUnit("Zealot", 5, 20, ""));
        units.add(new NonFlyingUnit("Dragoon", 3, 15, "레이저"));
        units.add(new NonFlyingUnit("HighTempler", 10, 2, ""));
        units.add(new FlyingUnit("Scout", 5, 10, ""));
        units.add(new FlyingUnit("Corsair", 4, 12, ""));
        return units;
    }
    
}