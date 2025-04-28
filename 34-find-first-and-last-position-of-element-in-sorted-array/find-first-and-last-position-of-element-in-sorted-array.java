class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        ans[0] = findBound(nums, target, true);   // find left bound
        ans[1] = findBound(nums, target, false);  // find right bound
        
        return ans;
    }
    
    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                result = mid;
                if (isFirst) {
                    right = mid - 1;  // continue searching left
                } else {
                    left = mid + 1;   // continue searching right
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
}
