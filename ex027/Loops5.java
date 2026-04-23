public class Loops5 {

    public static int getTimesDivisible(int dividend, int divisor) {
        int timesDivisible = 0;

        if (dividend < 0 || divisor < 0) {
            throw new IllegalArgumentException("Inputs cannot be negative");

        }
        if (divisor == 0 || divisor == 1) {
            throw new ArithmeticException("Divisor cannot be 0 or 1");

        }

        while (dividend / divisor > 0) {
            dividend = dividend / divisor;
            timesDivisible++;
        }

        return timesDivisible;
    }
}
