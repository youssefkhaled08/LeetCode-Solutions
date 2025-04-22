class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 2)
            return false;
        
        Set<Integer> window = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(window.contains(nums[i]))
                return true;

            window.add(nums[i]);
            if(i >= k)
                window.remove(nums[i-k]);
        }

        return false;
    }
}