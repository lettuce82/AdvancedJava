import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        String myName;

        System.out.print("Enter your Name: ");
        Scanner sc = new Scanner(System.in);
        myName = sc.next();
        System.out.printf("Greeing, %s\n", myName);
        sc.close();
    }
}