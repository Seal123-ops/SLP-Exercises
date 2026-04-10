public class ConditionalStatements4 {

     
    public static String makeAdjective(String adjective) {

        if (adjective.endsWith("le")) {
        return adjective.substring(0, adjective.length() - 1) + "y";
    
        } else if (adjective.endsWith("y")) {
        return adjective.substring(0, adjective.length() - 1) + "ily";
    
                
        } else {
            return adjective + "ly";
        }
    }  
}
