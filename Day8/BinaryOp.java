//메소드가 하나만 있는 인터페이스 -> 함수형 인터페이스(functional interface)

// 함수를 파라미터로 넘기지 못함
// 따라서 함수를 객체 만들어 넘겨야 함
// → 세 가지가 있음 (인터페이스, 클래스, 이넘)
// 이넘은 아님
// 클래스는 바디를 가짐 → 람다는 바디 내용이 항상 바뀌므로 클래스는 안 됨
// 바디가 없는 건 추상 클래스와 인터페이스
// 추상 클래스는 데이터(지역 변수)를 가질 수 있으므로 부적합
// 따라서 인터페이스 가능 - 그 중에서도 한 개의 메소드를 가지는 함수형 인터페이스만 가능하다

@FunctionalInterface
interface BinaryOP {
    int apply(int x, int y);
}

class Algo {
    public static int calc(BinaryOP binaryOP, int i, int j) {
        return binaryOP.apply(i, j);
    }
}

/*
 
* 람다가 없는 자바
class Adder implements BinaryOP {
    public int apply(int x, int y) {
        return x + y;
    }
}

class Mult implements BinaryOP {
    public int apply(int x, int y) {
        return x * y;
    }
}
*/

class BinaryOpTest {
    public static void main(String[] args) {
        // 람다가 없다면
        // Algo.calc(new Adder(), 1, 2);
        // Algo.calc(new Mult(), 3, 4);

        // 람다가 있다면
        // 1
        BinaryOP adder = (x, y) -> x + y;
        System.out.println(Algo.calc(adder, 3, 4));
        // 2
        System.out.println(Algo.calc((x, y) -> x * y, 3, 4));
    }
}