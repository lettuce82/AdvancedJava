public class Sample {
    public int doSomething() {
        int value = 0;
        return value;
    }
}

class Test6 {
    public static void main(String[] args) {
        Sample s = new Sample();
        int i = s.doSomething();
    }
}
