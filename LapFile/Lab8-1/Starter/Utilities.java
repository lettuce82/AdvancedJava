public class Utilities {
    public static int max(int i, int j) {
        if (i > j)
            return i;
        else 
            return j;
    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static int swap2(int i, int j) {
        return i;
    }

    public static String reverseString(String s) {
        String reverse = "";

        //재귀로 만들기
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }

    public static String recurseReverseString(String s, int index) {
        String reverse = "";
        
        if (index != 0) {
            reverse += s.charAt(index);
            recurseReverseString(reverse, --index);
        } else  {
            return reverse;
        }
        return reverse;
    }
}
