
public class Marine extends Unit implements Attackable {
    @Override
    public void attack(Unit unit) {
        System.out.println("원거리 공격");
        this.reduceHp(unit.getAttackPower());
    }
}
