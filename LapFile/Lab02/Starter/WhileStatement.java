public class WhileStatement {
    public static void main(String[] args) {
        /*
        int num1 = 1;
        int num2 = 1;

        while (num1 < 10) {
            while (num2 < 10) {
                System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
                num2++;
            }
            num2 = 1;
            num1++;
        }
         */

        int i = 2; int j = 1;
        while (i <= 9) {
            while (j <= 9) {
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            }
            i++;
            j = 1;
        }
    }
}
