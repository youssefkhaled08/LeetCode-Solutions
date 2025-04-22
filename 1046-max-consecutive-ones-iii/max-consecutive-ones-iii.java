class Solution {
    public int longestOnes(int[] nums, int k) {
        if (nums.length == 0)
            return 0;

        int max = 0;
        int left = 0, right = 0;
        int counter = 0;
        
        while (right < nums.length) {
            
            if (nums[right] == 0)
                counter++;
            
            while (counter > k) {
                if (nums[left] == 0)
                    counter--;
                left++;
            }
            
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}