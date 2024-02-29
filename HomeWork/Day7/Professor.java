public class Professor extends Member{
    String major;

    Professor(String name, int age, Gender gender, String major) {
        super(name, age, gender);
        this.major = major;
    }
    
}
