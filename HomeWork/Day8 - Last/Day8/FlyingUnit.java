// 날 수 있는 유닛 클래스
class FlyingUnit extends Unit {
    public FlyingUnit(String name, int attackPower, int defense, String hasWeapon) {
        super(name, attackPower, defense, hasWeapon, true);
    }

    @Override
    public boolean canAttackFlying(Unit target) {
        return true;
    }
}