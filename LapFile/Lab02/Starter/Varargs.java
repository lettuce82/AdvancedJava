public class Varargs {
public static int max(int... values) {
    /*
        int result = 0;
        for (int i = 0; i < values.length -1; i++) {
            if (values[i] > result) {
                result = values[i];
            }
        }
        return result;
     */

        int result  = values[0];
        for (int i : values) {
            result = max(i, result);
        }
        return result;
    }

    static int max(int i, int j) {
        return (i > j) ?  i : j;

    }

    static int max3(int i, int j, int k) {
        return max(max(i, j), k);
    }

    public static void main(String[] args) {
        System.out.println(max(1,2,5,6,3));
    }
}
