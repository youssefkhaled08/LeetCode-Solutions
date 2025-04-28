class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for (int weight: weights){
            left = Math.max(left, weight);
            right += weight;
        }

        while(left < right){
            int mid = left + (right - left) / 2;
            if(feasible(weights, days, mid))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
    public boolean feasible(int[] weights, int days, int capacity){
        int totalDays = 1;
        int totalWeight = 0;

        for(int weight: weights){
            totalWeight += weight;
            if(totalWeight > capacity){
                totalWeight = weight;
                totalDays += 1;
                if(totalDays > days)
                    return false;
            }
        }
        return true;
    }
}