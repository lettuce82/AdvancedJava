public class Box<T> {
    T item;
    
    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}

class BoxTest {
    public static void main(String[] args) {
        Object o = new String("abc");

        Box<Object> Box = new Box<>("abc");
        Box<Integer> box = new Box<>(1);
    }
}