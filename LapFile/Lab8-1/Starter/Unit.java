public class Unit {
    private int hp;
    private String name;
    //sub 클래스 -> super 클래스     : 암시적 형변환
    //super 클래스 -> sub 클래스     : 명시적 형변환
    //sub 클래스 -> sub 클래스     : 아예 안 됨

    public int getHp() {
        return this.hp;
    }

    public String getName() {
        return this.name;
    }

    public void attack() {
    }
}
    class Zealot extends Unit{

    }

    class Marine extends Unit {
        
    }

class Test {
    public static void main(String[] args) {
        Unit u = new Zealot(); //Unit 타입의 Zealot의 인스턴스
        //Zealot z = (Marine) u; //안됨

        Object[] objects = {new int[] {1,2}, new Zealot(), "abc"};
        for (Object object : objects) {
            if (object instanceof Zealot) {
                ((Zealot)object).attack();    
            }
        }
    }
}

