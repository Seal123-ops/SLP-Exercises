public class ConditionalStatements5 {

    public static String longestWord(String firstWord, String secondWord, String thirdWord) {
    String longestWord = firstWord;

        if (secondWord.length() > longestWord.length()) {
            longestWord = secondWord;
        }

        if (thirdWord.length() > longestWord.length()) {
            longestWord = thirdWord;
        }

        return longestWord;

    }
    
}
