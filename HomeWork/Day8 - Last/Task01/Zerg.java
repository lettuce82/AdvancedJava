// Zerg 종족 클래스

import java.util.ArrayList;
import java.util.List;

public class Zerg {
    static List<Unit> units = new ArrayList<>();
    String raceName = "Zerg";

    public static List<Unit> generateUnits() {
        units.add(new NonFlyingUnit("Zergling", 2, 2, ""));
        units.add(new NonFlyingUnit("Hydralisk", 3, 7, "침"));
        units.add(new NonFlyingUnit("Ultralisk", 5, 15, ""));
        units.add(new FlyingUnit("Mutalisk", 2, 8, ""));
        units.add(new FlyingUnit("Guardian", 3, 6, ""));
        return units;
    }
}