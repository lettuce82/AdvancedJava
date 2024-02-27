package task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(5, "채상희");
        Student s2 = new Student(2, "채상추");
        Student s3 = new Student(23, "채상차");
        Student s4 = new Student(25, "채상치");

        //버블 정렬
        Student[] stuArr = {s1, s2, s3, s4};

        for (int i = 0; i < stuArr.length - 1; i++) {
            if (stuArr[i].compareTo(stuArr[i + 1]) > 0) {
                Student temp;
                temp = stuArr[i];
                stuArr[i] = stuArr[i + 1];
                stuArr[i + 1] = temp;
            }
        }

        //List 넣기
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Collections.sort(list);
        Collections.shuffle(list);

        System.out.println("---------- 1. 버블 -----------");

        for (Student student : stuArr) {
            System.out.println(student);
        }

        System.out.println("---------- 2. 소트 -----------");

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
