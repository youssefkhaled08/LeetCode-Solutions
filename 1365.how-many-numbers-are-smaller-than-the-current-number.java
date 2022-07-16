import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode id=1365 lang=java
 *
 * [1365] How Many Numbers Are Smaller Than the Current Number
 */

// @lc code=start
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedNums = new int[nums.length];
        int[] results = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            sortedNums[i] = nums[i];
        }
        
        Arrays.sort(sortedNums);

        HashMap<Integer, Integer> smallerNumbersThanCurrent = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if(!smallerNumbersThanCurrent.containsKey(sortedNums[i]))
                smallerNumbersThanCurrent.put(sortedNums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            results[i] = smallerNumbersThanCurrent.get(nums[i]);
        }
       
        return results;
    }
}
// @lc code=end

