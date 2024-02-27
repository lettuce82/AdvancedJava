public class Singleton {
    private static Singleton singleton;

    private Singleton() {}

    public Singleton(int i) {

    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

/*
 * singleton class는 상속이 불가능함
 * 이유? 기본 생성자 호출이 필수인데 private으로 호출이 불가능하기 때문이다.

class ExtendedSingleton extends Singleton {

}
 */

 // singleton class 에 ovedrloading 한 생성자가 있다면
 // 상속 가능하다. -> 부모 클래스의 생성자를 호출할 것 -> super(i)
 class ExtendedSingleton extends Singleton {

    public ExtendedSingleton(int i) {
        super(i);
    }
    
 }
