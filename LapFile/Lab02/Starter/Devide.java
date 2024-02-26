import java.util.Scanner;

public class Devide {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String temp = sc.nextLine();
            int i = Integer.parseInt(temp);

            temp = sc.nextLine();
            int j = Integer.parseInt(temp);

            sc.close();

            int k = i / j;

            System.out.printf("%d / %d = %d\n", i, j, k);
        } catch (NumberFormatException e) {
            //문자를 입력한 경우
            System.out.println("정수를 입력하세요.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        
    }    
}
