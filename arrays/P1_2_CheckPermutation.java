package arrays;

import java.util.Arrays;

/**
 * Given two strings, write a method to decide if one is a permutation of the other
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * Example 1:

    Input: s = "anagram", t = "nagaram"
    Output: true
 * Example 2:
    Input: s = "rat", t = "car"
    Output: false
 */
/**
 * Approach 1: Sort the strings and compare if they are equal or not
 * Appraoch 2: Take a map and increment a each char up on paring in first string. and decrement in second string.
 *          if the any char count is not equal to zero then not a anagram
 * Apprach 3: Use a array of specified length, depending on the ascii range of the input
 *      if all small ch-'a' gives 0..
 */

public class P1_2_CheckPermutation {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        s = new String(sArr);
        t = new String(tArr);
        if (s.equals(t)){
            return true;
        } 
        return false;
    }
}
