import java.util.HashMap;

/*
 * @lc app=leetcode id=771 lang=java
 *
 * [771] Jewels and Stones
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int numOfJewels = 0;
        for(int i = 0; i < stones.length(); i++)
            if(jewels.indexOf(stones.charAt(i)) != -1)
                numOfJewels++;
        return numOfJewels;
    }
}
// @lc code=end

