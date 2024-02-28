import java.util.ArrayList;
import java.util.List;

public class Sample {
    public int add(int i, int j) {
        return i + j;
    }

    public <T extends Number> int returnToInt(T i) {
        return i.intValue();
    }

    public <T extends Number> T add(T i, T j) {
        //return i.intValue(); -> Number 에 있는 메소드 사용 가능
        return i;
    }

}

class Utilities {

    public static <T> List<T> arrayToList(T[] intArr) {
        List<T> list = new ArrayList<T>();

        for (T t : intArr) {
            list.add(t);
        }
        return list;
    }
    public static void main(String[] args) {
        Object o = new String("abc");
        //Box<Object> b = new Box<String>(); -> 타입 파라미터는 불공변적인 규칙을 가진다.
        Box<Object> b = new Box<>("abc"); // 따라서 아래처럼 작성하기

        Integer[] intArr = {1,2,3};

        Utilities ut = new Utilities();
        List<Integer> list = ut.arrayToList(intArr);

        list.get(0);
    }
}