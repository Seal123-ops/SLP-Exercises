public class Loops2 {

    public static String getRange(int start, int end, int increment) {
        String result = "";

        if (increment <= 0) {
            return "";
        }

        if (start > 0) {
            for (int i = start; i < end; i += increment) {
                result += "(" + i + ")";
            }
        }

        return result;
    }
    
}
