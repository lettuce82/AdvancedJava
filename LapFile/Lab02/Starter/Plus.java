class Rational {
    private int denominator;
    private int numerator;

    public void GCD() {

    }

    public Rational plus(Rational rational) {
        
        return rational;
    }

    public Rational mult(Rational rational) {
        return rational;
    }
}
public class Plus {
    public static Rational plusRational(Rational left, Rational right) {
        return left.plus(right);
    }
}
