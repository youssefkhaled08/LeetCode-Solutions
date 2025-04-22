class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 2)
            return false;
        
        Set<Integer> window = new HashSet<>();
        int left = 0;
        int right = 0;

        while(right < nums.length){
            if(right - left > k){
                window.remove(nums[left]);
                left++;
            }
            if (window.contains(nums[right]))
                return true;
            window.add(nums[right]);
            right++;

        }

        return false;
    }
}