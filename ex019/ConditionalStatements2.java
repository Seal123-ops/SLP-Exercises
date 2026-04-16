public class ConditionalStatements2 {
   
    public static String getSignum(int number) {
        if(number < 0) {
            return "negative";

        } else if (number > 0) {
            return "positive";
        } else {
            return "zero";
        }
    
        
    }
}
