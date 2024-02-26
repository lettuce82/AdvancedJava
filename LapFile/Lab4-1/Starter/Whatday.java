import java.util.Scanner;

public class Whatday {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};
    
    public static void main(String[] args) {
        int dayNum = 0;
        int monthNum = 0;
        String monthName = monthNames[monthNum];
        
        System.out.print("Enter a digit 1 betewwn 365: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        dayNum = Integer.parseInt(line);

        for (int days : daysInMonth) {
            if (dayNum <= days) {
                break;
            } else {
                dayNum -= days;
                monthNum++;
            }
        }

        System.out.printf("%s, %d", monthName, dayNum);
        
    }
}