// 유닛 클래스
abstract class Unit {
    protected String name;
    protected int attackPower;
    protected int defense;
    protected String hasWeapon;
    protected boolean canFly;

    public Unit(String name, int attackPower, int defense, String hasWeapon, boolean canFly) {
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
        this.hasWeapon = hasWeapon;
        this.canFly = canFly;
    }

    public abstract boolean canAttackFlying(Unit target);

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void decreaseDefense(int amount) {
        defense -= amount;
        if (defense <= 0) {
            defense = 0; // 방어력이 음수가 되지 않도록 0 이하인 경우에는 0으로 설정
        }
    }

    @Override
    public String toString() {
        return name + " (공격력: " + attackPower + ", 방어력: " + defense + ")";
    }
}