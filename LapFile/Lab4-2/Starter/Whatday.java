import java.util.Scanner;

public class Whatday {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int[] daysInLeapMonth  = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Enter a year number: ");
            int yearNum = scanner.nextInt();

            boolean isLeapYear = (yearNum % 4 == 0) && (yearNum % 100 != 0 || yearNum % 400 == 0);

            int maxDayNum = isLeapYear ? 366 : 365;
            System.out.println(maxDayNum);

            if (isLeapYear) {
                maxDayNum = 366;
            } else {
                maxDayNum = 365;
            }
 
            System.out.print("Enter a day number between 1 abd 365: ");
            String line = scanner.nextLine();
            int dayNum = Integer.parseInt(line);

            if (dayNum < 1 || dayNum > maxDayNum) {
                throw new IllegalArgumentException("Out of date range");
            }

            int monthNum = 0; 

            if (isLeapYear) {
                for (int days: daysInLeapMonth) {
                    if (dayNum <= days) {
                        break;
                    }
                    else {
                        dayNum -= days;
                        monthNum++;
                    }
                }
            } else {
                for (int days: daysInMonth) {
                    if (dayNum <= days) {
                        break;
                    }
                    else {
                        dayNum -= days;
                        monthNum++;
                    }
                }
            }
            
            String monthName = monthNames[monthNum];

            System.out.printf("%s, %d \n", monthName, dayNum);
        } catch (IllegalArgumentException e) {
            System.out.println("똑바로 해");
        }
        finally {
            scanner.close();
        }
    }
}