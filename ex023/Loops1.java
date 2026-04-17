public class Loops1 {
    public static int getSum(int n) {
        if (n < 0){
            return 0;
        }

        int sum = 0;
        for (int nTwo = 1; nTwo <= n; nTwo++) {
            sum += nTwo;
        }

        return sum;
    }
    
}
