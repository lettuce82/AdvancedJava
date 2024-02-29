import java.util.PrimitiveIterator;

public class Member {

    private String name;
    private int age;
    private Gender gender;

    Member(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Gender getGender() {
        return this.gender;
    }
}

enum Gender {
    MAN, WOMAN
}