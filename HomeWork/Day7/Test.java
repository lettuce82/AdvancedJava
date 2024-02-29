import java.util.Collections;
import java.util.Comparator;

public class Test {
    //private static StudentComparator<Student> comparator;

    public static void main(String[] args) {
        MyList<Student> list = new MyList<>();
        list.add(new Student(1, "채상희", "CE"));
        list.add(new Student(2, "채상희", "CE"));
        list.add(new Student(3, "채상희", "CE"));
        
        list.sort(); //학번 sort
        //람다
        list.sort((Student s1, Student s2) -> s1.getName().compareTo(s2.getName())); //학번 외의 sort
        list.sort((Student s1, Student s2) -> s1.getDepartment().compareTo(s2.getDepartment())); //학번 외의 sort
        
        for (Student s : list) {
            System.out.println(s + " ");
        }
    }
}
