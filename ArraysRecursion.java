public class ArraysRecursion {

	 public static boolean isPalindrome(char [] words){
      if((words.length) == 0 ){
         return true;
      }
      if((words.length) == 1 ){
         return true;
      }
      return isPalindromeHelper(0, words.length - 1, words);
    }

	 public static boolean isPalindromeHelper(int i, int j, char[] words){	
		if(i >= j) return true; // if i passed then all pairs matched
		if(i < words.length){
			 if(words[i] == words[j]){
				return isPalindromeHelper(i+1, j-1, words);
 	         } else{
				return false;
			 }
		}
		return true;
	 }   


    public static boolean isPalindrome(int [] integers){
      return isPalindromeIntHelper(0,integers.length - 1, integers);
    }

    public static boolean isPalindromeIntHelper(int i, int j, int[] integers) {
		if (i >= j) { //if i passed j then all pairs matched
			return true;
		}
		if (integers[i] == integers[j]) { 
			return isPalindromeIntHelper(i + 1, j - 1, integers);
		} else {
			return false;
		}
	 }

    
    public static boolean isSorted(int[] nums, boolean choice){
      return isSortedHelper(0, nums, choice);
    }

	 public static boolean isSortedHelper(int i, int[] nums, boolean choice){
		if (i >= nums.length - 1) return true;
		if (choice == true){
			if(nums[i] <= nums[i + 1]){ //check for ascending order
		      return isSortedHelper(i + 1, nums, choice);
			 } else {
				return false;
		 }
		} else {
			if(nums[i] >= nums[i + 1]){ //check for descending order
	            return isSortedHelper(i + 1, nums, choice);
	         } else {
				return false; 
			}

	   }

      
	 }
   
    public static  String removeLetters(String word, char[] letters){     
      if(word.length() == 0) return "";
      return removeLettersHelper(0, word, letters);
    }

    public static String removeLettersHelper(int i, String word, char[] letters){ 
		if (i >= word.length()) return "";
		if(word.charAt(i) == letters[0] || word.charAt(i) == letters[1]){
			return removeLettersHelper(i + 1, word, letters); //return next char and ignore current if it matches chars in letters
		} else {
			return word.charAt(i) + removeLettersHelper(i + 1, word, letters); //include current char and move to next
		}
    }

    
    public static int countOccurrences(int[] nums, int target){

      return countOccurrencesHelper(0, nums, target);
    }

	 public static int countOccurrencesHelper(int i, int[] nums, int target){
		if(i >= nums.length) return 0;
		if(nums[i] == target){
			return 1 + countOccurrencesHelper(i + 1, nums, target);
		} else {
			return countOccurrencesHelper(i + 1, nums, target); }

 	 } 


	// Skeleton implementation for now — replace with recursive logic later.
	/* public static double power(double [] nums, int pow){
      int i = 0;
      int len = nums.length;
      if(i <= len){
      return powerHelper(1, nums[i], pow);
      }
	 }

    public static double powerHelper ( int i, double x, int n){
      if(i > n){
         return 1;
      } else {
         return x * powerHelper(i + 1, x, n);
      }
    }*/


    public static void main(String[] args){

      isPalindrome(new char[]{'m','a','d','a','m'});
      isPalindrome(new int[]{1,2,3,2,1});
      isSorted(new int[]{9,8,7,6}, true);
      removeLetters("giaaaanaassa",new char[]{'a', 's'});
      countOccurrences(new int[]{1,3,4,4,3,2,3,4,5,3}, 4);
     // power(new double[]{2.3,5.6,5.7,2.0}, 2);


    }

}
