
public class Zeagling extends Unit implements Attackable {
    @Override
    public void attack(Unit unit) {
        System.out.println("기관총 공격");
        this.reduceHp(unit.getAttackPower());
    }

}
