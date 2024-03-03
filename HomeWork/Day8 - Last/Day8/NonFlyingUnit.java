// 날 수 없는 유닛 클래스
class NonFlyingUnit extends Unit {
    public NonFlyingUnit(String name, int attackPower, int defense, String hasWeapon) {
        super(name, attackPower, defense, hasWeapon, false);
    }

    @Override
    public boolean canAttackFlying(Unit target) {
        if (hasWeapon != "" || target.canFly == false) {
            return true;
        }
        return false;
    }
}
