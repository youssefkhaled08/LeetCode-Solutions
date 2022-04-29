/*
 * @lc app=leetcode id=283 lang=cpp
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int length = nums.size();
        
        if (length <= 1)
            return;
        
        int zeroPtr = 0;
        int numPtr = 0;

        while (numPtr < length)
        {
            if (nums[numPtr] == 0)
                numPtr++;
            else
            {
                swap(nums[zeroPtr], nums[numPtr]);
                numPtr++;
                zeroPtr++;
            }
        }
    }
};
// @lc code=end

