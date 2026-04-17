public class Loops3 {

    public static String stripConsonants(String word) {
        String vowelsOnly = "";
        String vowels = "aieouy";

        for(int i = 0; (i+1) <= word.length(); i += 1) {
            if (vowels.contains("" + word.charAt(i))) {
                vowelsOnly += word.charAt(i);
            }
        }

        return vowelsOnly;
    }
    
}
