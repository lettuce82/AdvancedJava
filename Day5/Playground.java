public class Playground {

    public static void main(String[] args) {
        Unit marine1 = new Marine();
        Unit marine2 = new Marine();
        Unit zealot = new Zealot();
        Unit zeagling = new Zeagling();
        Unit observer = new Observer();

        Unit[] units = new Unit[] {
            marine1,
            marine2,
            zealot,
            zeagling,
            observer
        };

        for (Unit unit : units) {
            if (unit instanceof Attackable) {
                ((Attackable)unit).attack(marine1);
            }
        }
    }
}