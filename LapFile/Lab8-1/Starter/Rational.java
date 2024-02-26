public class Rational {
    int numerator;
    int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        
        int g = this.gCD(numerator, denominator);

        this.numerator = this.numerator / g;
        this.denominator = this.denominator / g;
    }

    public Rational plus(Rational rational) {
        return rational;
        
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