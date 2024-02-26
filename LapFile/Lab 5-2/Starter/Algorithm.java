public class Algorithm {
    static final int addFrom1To10 = 55;

    static int accumulate(Adder binder, int init, int start, int end, int step) {
        int result = init;

        for (int next = init; next <= end; next = next + step) {
            result = binder.apply(result, next);
        }
        return result;
    }

    static int accumulate(Multiplier binder, int init, int start, int end, int step) {
        int result = init;

        for (int next = init; next <= end; next = next + step) {
            result = binder.apply(result, next);
        }
        return result;
    }

    static int sigma(int start, int end, int step) {
        return accumulate(new Adder(), 0, start, end, step);
    }

    static int pi(int start, int end, int step) {
        return accumulate(new Multiplier(), 1, start, end, step);
    }

    //
    // To-do add overloaded accumulate method here
    //

    public static void main(String[] args) {
        System.out.println(sigma(1, 10, 1));
        System.out.println(pi(1, 10, 1));
    }
}