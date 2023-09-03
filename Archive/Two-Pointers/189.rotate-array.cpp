/*
 * @lc app=leetcode id=189 lang=cpp
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
public:
    void reverse(vector<int>& arr, int start, int end){
        while (start < end)
        {
            swap(arr[start], arr[end]);
            start++;
            end--;
        }
        
    }
    void rotate(vector<int>& nums, int k) {
        k = k % nums.size();

        reverse(nums, 0, nums.size() - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.size() - 1);
    }
};
// @lc code=end

