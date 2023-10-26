package arrays;
/**
 * Is Uniqiue: Given an integer array nums,
 *   return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 * Example 1:

    Input: nums = [1,2,3,1]
    Output: true
    Example 2:

    Input: nums = [1,2,3,4]
    Output: false
    Example 3:

    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true
 */
import java.util.HashSet;
/**
 * Approach 1: Sort the array takes O(nlogn) time and O(logn) space
 * Approach 2: Use HashSet O(n) time and O(n) space
 * Approach 3: Use HashMap O(n) time and O(n) space 
 */
public class P1_1_IsUnique {
    boolean isUnique(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele: arr) {
            if(set.contains(ele)) {
                return true;
            }
            set.add(ele);
        }
        return false;
    }
    public static void main(String[] args) {
        P1_1_IsUnique obj = new P1_1_IsUnique();
        System.out.println(obj.isUnique(new int[]{1,2,3,4,5,6,1}));
    }
}


