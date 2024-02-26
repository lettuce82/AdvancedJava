public class SwichStatement {
    public static void main(String[] args) {
        int monthNumber = 6;
        int daysInMonth = 6;
        switch (monthNumber) {
            case 2:
                daysInMonth = 28; break;
            case 4:
            case 6:
                daysInMonth = 100; break;
                //break 가 없으면 case 11인 경우의 분기문인 daysInMonth = 30; break; 을 적용하고 switch문을 빠져나옴 
            case 9:
            case 11:
                daysInMonth = 30; break;
            default:
                daysInMonth = 31; break;
            }
        System.out.println(daysInMonth);
    }
}
