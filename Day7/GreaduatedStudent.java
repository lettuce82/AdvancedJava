public class GreaduatedStudent extends Student {
    private String major;

    public GreaduatedStudent(int studentNo, String name, String department, String major) {
        super(studentNo, name, department);
        this.major = major;
    }

    public String toString() {
        return super.toString() + this.major;
    }
}
