import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> numsHashMap = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
           Integer difference = target - nums[i];
           if(numsHashMap.containsKey(difference)){
               int[] indicies = {numsHashMap.get(difference), i};
               return indicies; 
           }
           numsHashMap.put(nums[i], i);
       }
       
       return null;
    }
}
// @lc code=end

