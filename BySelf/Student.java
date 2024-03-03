public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void print(Fuction fuction) {
        fuction.print(this.name);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("채상희");
        student.print(System.out::println);
    }
}