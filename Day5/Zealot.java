
public class Zealot extends Unit implements Attackable {
    @Override
    public void attack(Unit unit) {
        System.out.println("칼 공격");
        this.reduceHp(unit.getAttackPower());
    }
}
