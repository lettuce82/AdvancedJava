import java.util.Scanner;

public class WhatherV2 {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            
            System.out.println("enter your year: ");
            int maxDays = 365;
            String dus = scanner.nextLine();
            int yearNum = Integer.parseInt(dus);
            if(yearNum % 4 == 0 && (yearNum % 100 !=0 || yearNum % 400 == 0)){
                daysInMonth[1] = 29;
                maxDays ++;
            }

            System.out.printf("enter 1 Between %d : ",maxDays);
            String lin = scanner.nextLine();
            int dayNum = Integer.parseInt(lin);

            int monthNum = 0;

            if (dayNum > 31){
                monthNum++;
                dayNum -= 31;
            }

            System.out.println(dayNum);
            System.out.println(daysInMonth[1]);
            System.out.println(monthNum);
            if (dayNum > 28 && monthNum > 0) {     
                monthNum++;
                dayNum -= 28;
                
            }
            System.out.println(dayNum);
            System.out.println(daysInMonth[1]);
            System.out.println(monthNum);

            if (dayNum > 31 && monthNum > 0) {     // March
                monthNum++;
                dayNum -= 31;
            }
    
            if (dayNum > 30 && monthNum > 0) {     // April
                monthNum++;
                dayNum -= 30;
            }
    
            if (dayNum > 31 && monthNum > 0) {     // May
                monthNum++;
                dayNum -= 31;
            }
    
            if (dayNum > 30 && monthNum > 0) {     // June
                monthNum++;
                dayNum -= 30;
            }
    
            if (dayNum > 31 && monthNum > 0) {     // July
                monthNum++;
                dayNum -= 31;
            }
    
            if (dayNum > 31 && monthNum > 0) {     // August
                monthNum++;
                dayNum -= 31;
            }
    
            if (dayNum > 30 && monthNum > 0) {     // September
                monthNum++;
                dayNum -= 30;
            }
    
            if (dayNum > 31 && monthNum > 0) {     // October
                monthNum++;
                dayNum -= 31;
            } 

            if (dayNum > 30 && monthNum > 0) {     // 
                monthNum++;
                dayNum -= 30;
            } 

            if (dayNum > 31 && monthNum > 0) {     // 
                dayNum -= 31;
            } 


            String monthName = monthNames[monthNum];
            System.out.printf("%d년 %s, %d일",yearNum,monthName, dayNum);
        
    }
    catch(IllegalArgumentException e){
        e.printStackTrace();
    }
    finally{
        scanner.close();
    }
}
}