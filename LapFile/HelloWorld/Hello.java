import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        int i, j;

        try {
            Scanner sc = new Scanner(System.in);

            i = sc.nextInt();
            j = sc.nextInt();

            System.out.println(i / j);
            sc.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}