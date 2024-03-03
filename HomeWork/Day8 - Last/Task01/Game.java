import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    public List<Unit> choiceUnits(int choice) {
        List<Unit> playerUnits = new ArrayList<>();
        switch (choice) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    int terranUnitSize = Terran.generateUnits().size();
                    int unitNum = random.nextInt(terranUnitSize);
                    playerUnits.add(Terran.generateUnits().get(unitNum));
                }
                break;
            case 2:
                for (int i = 0; i < 4; i++) {
                    int protosUnitSize = Protos.generateUnits().size();
                    int unitNum = random.nextInt(protosUnitSize);
                    playerUnits.add(Protos.generateUnits().get(unitNum));
                }
                break;
            case 3:
                for (int i = 0; i < 8; i++) {
                    int zergUnitSize = Zerg.generateUnits().size();
                    int unitNum = random.nextInt(zergUnitSize);
                    playerUnits.add(Zerg.generateUnits().get(unitNum));
                }
                break;
            default:
                System.out.println("잘못된 선택입니다. 기본값으로 Terran을 선택합니다.");
                for (int i = 0; i < 5; i++) {
                    int unitNum = random.nextInt(Terran.generateUnits().size());
                    playerUnits.add(Terran.generateUnits().get(unitNum));
                }
                break;
        }
        return playerUnits;
    }

    public void displayUnits(List<Unit> units, String side) {
        System.out.println(side + "의 유닛:");
        for (int i = 0; i < units.size(); i++) {
            System.out.println((i + 1) + ". " + units.get(i).getName() + " (방어력: " + units.get(i).getDefense() + ")");
        }
    }

    public void play() {
        System.out.print("종족을 선택하세요 (1: Terran, 2: Protos, 3: Zerg): ");
        int choice = scanner.nextInt();
        List<Unit> myUnits = choiceUnits(choice);
        List<Unit> computerUnits = choiceUnits(random.nextInt(3) + 1);

        while (!myUnits.isEmpty() && !computerUnits.isEmpty()) {
            System.out.println("--------------------");
            displayUnits(computerUnits, "적군");
            System.out.println("--------------------");
            displayUnits(myUnits, "아군");

            // 아군의 공격
            System.out.print("아군이 공격할 유닛을 선택하세요: ");
            int attackIndex = scanner.nextInt() - 1;
            System.out.print("적군의 방어할 유닛을 선택하세요: ");
            int targetIndex = scanner.nextInt() - 1;

            if (attackIndex >= 0 && attackIndex < myUnits.size() &&
                targetIndex >= 0 && targetIndex < computerUnits.size()) {
                Unit attackingUnit = myUnits.get(attackIndex);
                Unit targetUnit = computerUnits.get(targetIndex);

                attack(attackingUnit, targetUnit);
                if (targetUnit.getDefense() <= 0) {
                    System.out.println("적군 " + targetUnit.getName() + "을(를) 격파했습니다!");
                    computerUnits.remove(targetUnit);
                }
            } else {
                System.out.println("유효하지 않은 선택입니다. 다시 선택하세요.");
            }

            if (computerUnits.isEmpty()) {
                System.out.println("적군을 모두 격파했습니다. 승리하였습니다!");
                break;
            }

            // 적군의 공격
            int computerAttackerIndex = random.nextInt(computerUnits.size());
            int computerTargetIndex = random.nextInt(myUnits.size());
            Unit computerAttackingUnit = computerUnits.get(computerAttackerIndex);
            Unit computerTargetUnit = myUnits.get(computerTargetIndex);

            attack(computerAttackingUnit, computerTargetUnit);
            if (computerTargetUnit.getDefense() <= 0) {
                System.out.println("아군 " + computerTargetUnit.getName() + "이(가) 격파당했습니다!");
                myUnits.remove(computerTargetUnit);
            }

            if (myUnits.isEmpty()) {
                System.out.println("아군이 모두 격파당했습니다. 패배하였습니다.");
                break;
            }
        }
    }
    
    public void attack(Unit attacker, Unit target) {
        if (!attacker.canAttackFlying(target)) {
            System.out.println("해당 유닛은 공격할 수 없습니다.");
            return;
        }
    
        int damage = attacker.getAttackPower();
        target.setDefense(target.getDefense() - damage);
        System.out.println(attacker.getName() + "이(가) " + target.getName() + "을(를) 공격했습니다. (" + damage + "의 데미지)");
    }
}