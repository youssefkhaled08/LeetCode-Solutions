class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double windowAvg = 0;

        for (int i = 0; i < k; i++) {
            windowAvg += nums[i];
        }

        maxAvg = Math.max(maxAvg, windowAvg / k);

        for (int i = k; i < nums.length; i++) {
            windowAvg += nums[i] - nums[i - k];
            maxAvg = Math.max(maxAvg, windowAvg / k);

        }

        return maxAvg;
    }
}