public class RationalOperators {
    public static int[] plus(int[] left, int[] right) {
        int numerator = left[0] + right[0];
        int denominator = left[1] + right[1];

        int g = gCD(numerator, denominator);

        numerator = numerator / g;
        denominator = denominator / g;
        return new int[] {numerator, denominator};
    }

    public static int[] times(int[] left, int[] right) {
        int numerator = left[0] * right[0];
        int denominator = left[1] * right[1];

        int g = gCD(numerator, denominator);

        numerator = numerator / g;
        denominator = denominator / g;
        return new int[] {numerator, denominator};
    }

    public static int[] devides(int[] left, int[] right) {
        int[] result = times(left, right);
        return new RationalOperators().devides(left, right);

        //return new int[] {numerator, denominator};
    }

    private static int gCD(int m, int n) {
        // if (n == 0) {
        //     return m;
        // } else {
        //     return gCD(n, m % n);
        // }
        return (n == 0) ? m : gCD(n, m % n);
    }
}

class Test {
    public static void main(String[] args) {
        Rational i = new Rational(2, 4);
        Rational result = i.plus(i);

        
    }
}