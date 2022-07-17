
/*
 * @lc app=leetcode id=922 lang=java
 *
 * [922] Sort Array By Parity II
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int size = nums.length;
        int evenPtr = 0;
        int oddPtr =  1;

        while (evenPtr < size && oddPtr < size){
            while(evenPtr < size && nums[evenPtr] % 2 == 0)
                evenPtr += 2;
            while(oddPtr < size && nums[oddPtr] % 2 != 0)
                oddPtr += 2;
            
            
            if(evenPtr < size && oddPtr < size){
                int temp = nums[evenPtr];
                nums[evenPtr] = nums[oddPtr];
                nums[oddPtr] = temp;  
            }
            
        }
        return nums;
    }
}
// @lc code=end

