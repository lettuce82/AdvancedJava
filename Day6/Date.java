public class Date {

    private int year;
    private int month;
    private int day;

    //기본 생성자 - Object 에서 상속받은 메서드
    //public Date();

    //생성자 접근제어자를 private으로 하면 외부에서 객체생성이 불가능함
    //객체생성을 막고 싶을 때 사용 - ex. Math 클래스

    //생성자 형성1 - 생성자는 반환타입이 없음(void가 아님 아예 안 씀)
    public Date() {
        this(1971, 4, 28);
    }
    
    //생성자 형성2 - overloading
    public Date(int year) {
        this(year, 1, 1);
    }

    //생성자 형성3 - overloading
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getDate(){
        return this.year + "-" + this.month + "-" + this.day;
    }

    public String getYear(){
        return this.year + "";
    }

    public String getMonth(){
        return this.month + "";
    }

    public String getDay(){
        return this.day + "";
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
class Test {
    public static void main(String[] args) {
        Date date = new Date();     
        //System.out.println(date.getDate()); -> 초기화를 따로 하지 않으면 0-0-0 이 나옴
        System.out.println(date.getDate());

        Object date1 = new Date();   //Object 타입의 Date 객체 - 메모리상에는 Date 가 올라감 - Object 타입의 Date 의 인스턴스
        //date1.getData() -> 불가
    }
}