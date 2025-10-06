public class WordsWordsWords{
 
 public static boolean isAbecedarian(String word){
   if(word.length() != 6){
    return false;
   }
    if(word.charAt(0) < word.charAt(1)&& word.charAt(1) < word.charAt(2)&& word.charAt(2) < word.charAt(3)&& word.charAt(3) < word.charAt(4)&& word.charAt(4) < word.charAt(5)){
     System.out.println("The word is an abecedarian"); 
     return true; 
    } 
    return false;
 }

 public static boolean isDoubloon(String word){
   String w1 = word.toLowerCase();
   if(w1.length() != 6){
     return false;
   }
    
   char char0 = w1.charAt(0);
   int count0 = 0;
   if (w1.charAt(0) == char0) {
     count0++;
   }
   if (w1.charAt(1) == char0) {
     count0++;
   }
   if (w1.charAt(2) == char0) {
     count0++;
        }
        if (w1.charAt(3) == char0) {
          count0++;
        }
        if (w1.charAt(4) == char0) {
          count0++;
        }
        if (w1.charAt(5) == char0) {
          count0++;
        }

        char c1 = w1.charAt(1);
        int count1 = 0;
        if (w1.charAt(0) == c1) {
          count1++;
        }
        if (w1.charAt(1) == c1) {
          count1++;
        }
        if (w1.charAt(2) == c1) {
          count1++;
        }
        if (w1.charAt(3) == c1) {
          count1++;
        }
        if (w1.charAt(4) == c1) {
          count1++;
        }
        if (w1.charAt(5) == c1) {
          count1++;
        }

        char c2 = w1.charAt(2);
        int count2 = 0;
        if (w1.charAt(0) == c2) {
          count2++;
        }
        if (w1.charAt(1) == c2) {
          count2++;
        }
         if (w1.charAt(2) == c2) {
          count2++;
        }
         if (w1.charAt(3) == c2) {
          count2++;
        }
         if (w1.charAt(4) == c2) {
          count2++;
        }
        if (w1.charAt(5) == c2) {
          count2++;
        }

        if(count0 == 2 && count1 == 2 && count2 == 2){
          System.out.println("The word is a doubloon :) ");
          return true;
        } else {
          return false;
        }
  }


  public static int isopsephyValue(String word){
   if (word.length() != 4) {
        System.out.println("Word must be 4 letters: " + word);
        return 0; 
  }
  String w1 = word.toLowerCase();
  int value = (w1.charAt(0) - 'a' + 1) +(w1.charAt(1) - 'a' + 1) +(w1.charAt(2) - 'a' + 1) +(w1.charAt(3) - 'a' + 1);
  return value;

  }


  public static double avgIsopsephy(String word1, String word2, String word3) {
   if (word1.length() != 4 || word2.length() != 4 || word3.length() != 4) {
    return -1;
   }
   int sum = isopsephyValue(word1) + isopsephyValue(word2) + isopsephyValue(word3);
   double avg = sum / 3.0;
   System.out.println(avg);
   return avg;
  }

 public static boolean isopsephySumEqual(String word1, String word2){
   if(word1.length() == 4 && word2.length() == 4){
    if(isopsephyValue(word1) == isopsephyValue(word2)){
     System.out.println("Their sums are equal to each other");
     return true;
    } else {
     return false; 
    }
   } else {
    return false;
   }

 }

 public static String reverseString(String word){
    if(word.length() != 5){
     String result = "";
     return result;
    } else {
     String reversedString = word.substring(4,5) + word.substring(3, 4) + word.substring(2,3) +  word.substring(1, 2) + word.substring(0, 1); 
     System.out.println(reversedString);
     return reversedString;
    }
 }
 public static void main(String[] args){
   isAbecedarian("abdest");
   isAbecedarian("abcdefgh");
   isAbecedarian("abd");

   isDoubloon("emmett");
   isDoubloon("emm");
   isDoubloon("emmettaa");

   reverseString("cookie");
   reverseString("drake");

   avgIsopsephy("kids", "book", "gaps");
   avgIsopsephy("kid", "book", "gap");

 }
}
