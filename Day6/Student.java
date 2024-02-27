public class Student extends Member {
    private String department;
    private int point;

    //부모 클래스에 생성자를 overloading 하지 않은 경우에는 기본생성자를 자동으로 넣어줌
    //public Member() {} 혹은
    //public Student(String department) {
    //    super();
    //    this.department = department;
    //}

    public Student(int no, String name) {
        super(no, name);
    }

    public Student setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Student setPoint(int point) {
        this.point = point;
        return this;
    }
}

class Test2 {
    public static void main(String[] args) {
        //Student s = new Student(1, "홍길동", "CE");
        Student s2 = new Student(1, "채상희").setDepartment("CE").setDepartment("10");
    }
}