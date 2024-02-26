
public class Hydra extends Unit implements Attackable {
    @Override
    public void attack(Unit unit) {
        System.out.println("몰라 공격");
        this.reduceHp(unit.getAttackPower());
    }
}
