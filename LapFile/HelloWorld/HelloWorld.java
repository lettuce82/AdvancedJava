import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.: ");
        int i = sc.nextInt();
        System.out.println("test: " + i);
        sc.close(); //메모리 누수 방지
    }
}

/**
 * Sample2
 */
class Sample2 {
    public static void main(String[] args) {
        System.out.println("From Sample2 class");
    }
}