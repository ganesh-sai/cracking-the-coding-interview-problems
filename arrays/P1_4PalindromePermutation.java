package arrays;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 *  A palindrome is a word or phrase that is the same forwards and backwards. 
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 *  You can ignore casing and non-letter characters.
 */
public class P1_4PalindromePermutation {
    public boolean isPalindromePermutation(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int[] table = new int[26];
        for(char ch : arr) {
            if(ch>='a' && ch <= 'z') {
                table[ch-'a']++;
            }
        }

        int oddCounts = 0;
        for(int i=0;i< arr.length;i++) {
            if(table[i] %2!=0) {
                oddCounts++;
            }
            if(oddCounts >1) {
                return false;
            }
        }
        return true;
    }    
    public static void main(String[] args) {
        P1_4PalindromePermutation  obj = new P1_4PalindromePermutation();
        System.out.println(obj.isPalindromePermutation("Tact Coa"));
    }
}
