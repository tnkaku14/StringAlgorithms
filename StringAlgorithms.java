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
        capLetter = capitalizeString.substring(0,1).toUpperCase();
        capitalizeString = capLetter + sentence.substring(1);
        for(int i = 0; i<sentence.length();i++){
              if(sentence.substring(i,i+1).equals(" ")){
                  capLetter = sentence.substring(i+1,i+2).toUpperCase();
                  capitalizeString = capitalizeString.substring(0,i+1);
                  capitalizeString += capLetter;
                  capitalizeString += sentence.substring(i+2,sentence.length());
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
        boolean isPalindrome = false;
        String letter = "";
        for(int i=0;i<word.length();i++){
            if(word.substring(i,i+1).equalsIgnoreCase(word.substring(word.length()-i -1,word.length()-i))){
               isPalindrome = true;
            }
            else{
               isPalindrome = false;
            }
        }
        return isPalindrome;
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
        String myWord = "Racecar";
        String mySentence = "i really like racecars.";
        System.out.println("Testing printCharacters:");
        // Example:
        System.out.println(printCharacters(myWord));
        
        System.out.println("\nTesting reverseWord:");
        // Example:
        System.out.println(reverseWord(myWord));

        System.out.println("\nTesting capitalizeString:");
        // Example:
        System.out.println(capitalizeString(mySentence));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        System.out.println(detectPalindrome(myWord));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        // System.out.println(firstUniqueChar(myWord));
    }
}
