public class WordsRecursion {
    
    
    public static String removeLetter(String word, char letter) {
       String result = removeLetterHelper(0, word, letter);
        return result;
    }

    public static String removeLetterHelper(int i, String word, char letter){
       if(word.charAt(i) ==letter){
         String w1= word.substring(i-1, i) + word.substring(i+1, word.length());
         return w1;
       } else {
         return removeLetterHelper(i+1, word, letter);
       }
    }
   
    public static boolean isAbecedarian(String word) {
        return isAbecedarianHelper(0, word);
    } 
     
    public static boolean isAbecedarianHelper(int i, String word){
        if(i >= word.length()-1){
         return true; //base case
        }
        if (word.charAt(i) <= word.charAt(i + 1)){
            return isAbecedarianHelper(i + 1, word);
        } else {
            return false;
        }
    
    }
   
    public static String generateRandWord(int length) {
        return generateRandWordHelper(0, length, "abcdefghijklmnopqrstvwxyuz");
    }

   private static String generateRandWordHelper(int i, int length, String letters) {
    if (i >= length) {
        return "";
    }

    //generating a random number from 0 to 26 since (int)(0-0.9 * 26) will be 0-25
    int index = (int)(Math.random() * letters.length());
    char letter = letters.charAt(index);


    return letter + generateRandWordHelper(i + 1, length, letters);
}
   
    public static int isopsephyHelper(int i,String word) {
       if (i >= word.length()) {
        return 0;
    }
        int sum = 0;
        String w1 = word.toLowerCase();
        sum = w1.charAt(i) - 'a' + 1; //this ensures we count from 1 not 97
        return sum + isopsephyHelper(i + 1, word);
    }
    
    public static int isopsephy(String word){
        return isopsephyHelper(0, word);
    
    }

    public static double avgIsopsephy(String[] words) {
      double sum = sumIsopsephyHelper(0, words);
      double avg = sum / words.length;
      return avg;
    }
    private static double sumIsopsephyHelper(int i, String[] words) {

    if (i >= words.length) {
        return 0;
    }
    return isopsephy(words[i]) + sumIsopsephyHelper(i + 1, words);
}
    
    
    public static String reverseString(String word) {
           return reverseStringHelper(word.length()- 1, word);
    }

    public static String reverseStringHelper(int i, String word){
        if(i >= 0){
        
         String w1 = word.charAt(i) + "" + reverseStringHelper(i- 1, word);
         return w1;
        } else {
         return "";
        }
    
        }
    
    public static void main(String[] args) {
        System.out.println(removeLetter("gianna", 'a'));

        System.out.println(isAbecedarian("abcdef"));
        System.out.println(isAbecedarian("abcdsg"));

        System.out.println(generateRandWord(4));
        System.out.println(generateRandWord(8));

        System.out.println(isopsephy("gianna"));    
        String[] words = {"gianna", "blessing", "ishema"};
        System.out.println(avgIsopsephy(words));

        System.out.println(reverseString("gianna"));


    }
}