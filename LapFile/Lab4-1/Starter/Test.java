import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Enter a digit 1 between 365: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int dayNum = Integer.parseInt(line);

        int monthNum = 0;
            
        if (dayNum > 31) {     // January
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 28) {     // Feburary
            monthNum++;
            dayNum -= 28;
        }

        if (dayNum >= 31) {     // March
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 30) {     // April
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum >= 31) {     // May
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 30) {     // June
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum >= 31) {     // July
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 31) {     // August
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 30) {     // September
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum >= 31) {     // October
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 30) {     // November
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum >= 32) {     // December
            monthNum++;
            dayNum -= 31;
        }
        

        String monthName = "";

        switch(monthNum) {
            case 0:
                monthName = "January";
                break;
            case 1:
                monthName = "Feburary";
                break;
            case 2:
                monthName = "March";
                break;
            case 3:
                monthName = "April";
                break;
            case 4:
                monthName = "May";
                break;
            case 5:
                monthName = "June";
                break;
            case 6:
                monthName = "July";
                break;
            case 7:
                monthName = "August";
                break;
            case 8:
                monthName = "September";
                break;
            case 9:
                monthName = "October";
                break;
            case 10:
                monthName = "November";
                break;
            case 11:
                monthName = "December";
                break;
            default:
                monthName = "Not Set";
                break;
        }

        System.out.printf("%s, %d ", monthName, dayNum);
    }
    
}