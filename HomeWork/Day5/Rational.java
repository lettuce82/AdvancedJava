public class Rational {

    private int numerator;
    private int denominator;

    // 생성자
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // 분자 getter
    public int getNumerator() {
        return numerator;
    } 

    // 분모 getter
    public int getDenominator() {
        return denominator;
    }

    // 더하기 계산 메서드
    public Rational add(Rational other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // 빼기 계산 메서드
    public Rational subtract(Rational other) {
        return add(new Rational(-other.numerator, other.denominator));
    }

    // 곱하기 계산 메서드
    public Rational multiply(Rational other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }
    
    // 나누기 계산 메서드
    public Rational divide(Rational other) {
        Rational reciprocal = new Rational(other.denominator, other.numerator);
        return multiply(reciprocal);
    }

    //정수를 입력했을 때
    public Rational add(int number) {
        return add(new Rational(number, 1));
    }
    
    public Rational subtract(int number) {
        return subtract(new Rational(number, 1));
    }
    
    public Rational multiply(int number) {
        return multiply(new Rational(number, 1));
    }
    
    public Rational divide(int number) {
        return divide(new Rational(number, 1));
    }
    

    // toString 오버라이드
    @Override
    public String toString() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }

    // 최대공약수(GCD) 계산 메서드
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 약분 메서드
    private void simplify() {
        int commonFactor = gcd(numerator, denominator);
        numerator /= commonFactor;
        denominator /= commonFactor;
    }
}

class Test {
    public static void main(String[] args) {
        Rational rational1 = new Rational(0, 3);
        Rational rational2 = new Rational(1, 2);
        Rational result = rational1.add(rational2);
        System.out.println(result);
        Rational result2 = rational1.minus(rational2);
        System.out.println(result2);
        
    }
}