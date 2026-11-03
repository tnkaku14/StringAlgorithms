public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
        // TODO: Implement this method
        String printCharacters = "";
        for(int i = 0;i<word.length();i++){
            printCharacters += word.substring(i,i+1);
            printCharacters += "\n";
        }
        return printCharacters;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        // TODO: Implement this method
        String reverseWord = "";
        for(int i=word.length();i>0;i--){
            reverseWord += word.substring(i-1,i);
        }
        return reverseWord;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        // TODO: Implement this method
        String capitalizeString = sentence;
        String capLetter = "";
        for(int i = 0; i<sentence.length();i++){
              if(sentence.substring(i,i+1) == " "){
                  capLetter = sentence.substring(i+1,i+2).toUpperCase();
                  
              }
        }
        return capitalizeString;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
        return false;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
        // TODO: Implement this method
        return ' ';
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        String myWord = "Spiderman";
        String mySentence = "I really like spiderman.";
        System.out.println("Testing printCharacters:");
        // Example:
        System.out.println(printCharacters(myWord));
        
        System.out.println("\nTesting reverseWord:");
        // Example:
        System.out.println(reverseWord(myWord));

        System.out.println("\nTesting capitalizeString:");
        // Example:
        //System.out.println(capitalizeString(mySentence));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        // System.out.println(detectPalindrome(myWord));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        // System.out.println(firstUniqueChar(myWord));
    }
}
