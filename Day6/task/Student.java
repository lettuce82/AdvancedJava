package task;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    private int studentNo;
    private String name;

    public Student(int studentNo, String name) {
        this.studentNo = studentNo;
        this.name = name;
    }

    public int getStudentNo() {
        return this.studentNo;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Student student) {

        if (this.getStudentNo() > student.getStudentNo()) {
            return 1;
        } else if (this.getStudentNo() < student.getStudentNo()) {
            return -1;
        } else {
            return 0;
        }
        // return this.studentNo - student.studentNo;
    }

    @Override
    public String toString() {
        return this.getStudentNo() + "번 " + this.getName();
    }
}
