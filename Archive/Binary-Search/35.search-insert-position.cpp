/*
 * @lc app=leetcode id=35 lang=cpp
 *
 * [35] Search Insert Position
 *
 * https://leetcode.com/problems/search-insert-position/description/

 */

// @lc code=start
class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int start = 0;
        int end = nums.size();
        int mid;
        
        while (start < end){
            mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid;
            else 
                start = mid + 1;
        }
        return start;
    }
};
// @lc code=end

