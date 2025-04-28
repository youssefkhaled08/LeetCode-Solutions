class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;

        for(int num: nums){
            left = Math.max(left, num);
            right += num;
        }

        while(left < right){
            int mid = left + (right - left) / 2;
            if(feasible(nums, k, mid))
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
    public boolean feasible(int[] nums, int k, int capacity){
        int totalSplits = 1;
        int total = 0;
        for(int num: nums){
            total += num;
            if(total > capacity){
                total = num;
                totalSplits += 1;
                if(totalSplits > k)
                    return false;
            }
        }
        return true;
    }
}