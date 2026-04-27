public class Loops6 {

    public static int investmentCalculator(double initial, double interestRate, double target ) {
        int years = 0;
        double currentBalance = initial;

        if (initial < 0 || interestRate < 0 || target < 0) {
            throw new IllegalArgumentException("Cannot be negative");
        }

        if (initial >= target) {
            return 0;
        }

        if (interestRate == 0 || initial == 0) {
            throw new ArithmeticException("Target investement is unreachable");
        }

        while (currentBalance < target) {
            currentBalance += currentBalance * (interestRate / 100);
            years++;
        }

        return years;
    }

   
    
}
