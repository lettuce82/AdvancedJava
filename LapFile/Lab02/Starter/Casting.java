public class Casting {
    public static void main(String[] args) {
        long l = 10l;
        int i = 5;

        //명시적 형 변환
        i = (int) l;

        long longValue = Long.MAX_VALUE;
        int intValue = (int)longValue;
        System.out.println(Long.MAX_VALUE);
        System.out.printf("(long) %d = %d\n", longValue, intValue);
        System.out.println(Integer.MAX_VALUE);
    }
}
