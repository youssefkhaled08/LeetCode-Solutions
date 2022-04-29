/*
 * @lc app=leetcode id=977 lang=cpp
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int length = nums.size();
        int positivePointer = 0;

        while (positivePointer < length && nums[positivePointer] < 0)
        {
            positivePointer++;
        }
        
        vector<int> sortedSquares(length, 0);
        int negativePointer = positivePointer - 1;
        int counter = 0;
        
        while (negativePointer >= 0 && positivePointer < length)
        {
            if (nums[negativePointer] * nums[negativePointer] < nums[positivePointer] * nums[positivePointer]){
                sortedSquares[counter] = nums[negativePointer] * nums[negativePointer];
                negativePointer--;
            }else{
                sortedSquares[counter] = nums[positivePointer] * nums[positivePointer];
                positivePointer++;
            }
            counter++;
        }

        while (negativePointer >= 0)
        {
            sortedSquares[counter] = nums[negativePointer] * nums[negativePointer];
            negativePointer--;
            counter++; 
        }

        while (positivePointer < length)
        {
            sortedSquares[counter] = nums[positivePointer] * nums[positivePointer];
            positivePointer++;
            counter++;
        }  
        
        return sortedSquares;
    }
};
// @lc code=end

