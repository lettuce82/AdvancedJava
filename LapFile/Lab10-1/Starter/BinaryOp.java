@FunctionalInterface
//추상메서드가 하나인 것 -> default, static 메서드가 여러개여도 괜찮음
interface BinaryOp {
    int apply(int left, int right);
}
