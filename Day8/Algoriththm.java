class Adder2 implements BinaryOp2 {
    public int apply(int i, int j) {
        return i + j;
    }
}

public class Algoriththm {
    public static int calc(BinaryOp2 binaryOp2, int i, int j) {
        return binaryOp2.apply(i, j);
    }
}

class BinaryOp2Test {
    public static void main(String[] args) {
        Adder2 adder2 = new Adder2();
        Algoriththm.calc(adder2, 1, 2);
        
        //객체 만들기 
        BinaryOp2 b = new BinaryOp2() {
            public int apply(int i, int j) {
                return i + j;
            }
        };
        Algoriththm.calc(b, 1, 2);

        //위에 있는 객체 만들기를 람다로 표현하기
        BinaryOp2 bb = (i, j) -> i + j;
        Algoriththm.calc(bb, 1, 2);
        
        //익명클래스로 정의하기
        Algoriththm.calc(
            new BinaryOp2() {
                public int apply(int i, int j) {
                    return i + j;
                }
            }, 1, 2);
        

            
    }
}

