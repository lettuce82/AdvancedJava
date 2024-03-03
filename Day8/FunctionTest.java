class PrintToStandardOutput implements Function {
    public void print(String name) {
        System.out.println(name);
    }
}

public class FunctionTest {
    public static void main(String[] args) {
        Student s = new Student(1, "채상희");

        //익명클래스
        Function ff = new Function() {
            public void print(String x) {
                System.out.println(x);
            }
        };
        s.printName(ff);

        //람다
        Function f = x -> System.out.println(x);
        s.printName(f);
        //혹은
        s.printName(x -> System.out.println(x));

        

        // f에 들어갈 수 있는 것

        // 1. Function interface를 구현한 클래스 -> PrintToStandardOutput
        // PrintToStandardOutput std = new PrintToStandardOutput();
        // s.printName(std);

        // 2-1. interFace의 함수를 일회용 클래스로 만들기 -> 익명클래스
        // Function f = new Function() {
        //     public void print(String name) {
        //         System.out.println(name);
        //     }
        // };
        // s.printName(f);

        // 2-2.
        // 2와 같은데 아래와 같이 표현도 가능
        // s.printName(
        //     new Function() {
        //         public void print(String name) {
        //             System.out.println(name);
        //         }
        //     }
        // );
    }
}
