public class Parameter {
    static void process(int value) {
        System.out.println("전달받은 파라미터의 값: " + value);
        value = 10;
        System.out.println("함수 내에서 변경한 파라미터의 값: " + value);
    }
    public static void main(String[] args) {
        int i = 5;
        System.out.println("전달받은 파라미터의 값: " + i);
        process(i);
        System.out.println("process 함수 호출 후의 변수 값: " + i);
    }
}
