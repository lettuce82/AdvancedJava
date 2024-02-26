public class NewString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        //new 사용 x -> true
        System.out.println(s1 == s2);

        //new 사용 -> false
        System.out.println(s3 == s4);

        String s5 = new String("abc");
        String s6 = s5;
        s5 = "def";
        System.out.println(s5);

        //String sArr1 = new String("abc|abc"); -> abc|abc 라고 나옴
        String sArr1 = new String("abc\\|abc");
        String[] sArr = sArr1.split(",");
        for (String string : sArr) {
            System.out.println(string);
        }

        String s7 = new String("abc");
        String s8 = new String("abc");
        String s9 = new String("ABC");
        System.out.println(s7 == s8); //false
        System.out.println(s7.equals(s8)); //true
        System.out.println(s7.compareTo(s8)); //0 -> 같다
        System.out.println(s7.compareTo(s9)); //32 -> 대소문자 차이
        System.out.println(s9.compareTo(s7)); //-32 -> 대소문자 차이
    }
}
