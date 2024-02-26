import java.util.Scanner;

public class Utilities {
    public static int max(int i, int j) {
        if (i > j)
            return i;
        else
            return j;
    }

    public static int max(int i, int j, int k) {
        return max(max(i, j), k);
    }

    public static int max(int... values) {
        int result = values[0];
        for (int i : values) {
            result = max(i, result);
        }
        
        return result;
    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Utilities.max(1, 2, 3, 4));
    }
}