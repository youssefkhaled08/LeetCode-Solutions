class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long)m * k)
            return -1;
        
        int left = 1;
        int right = 0;

        for(int bloom: bloomDay){
            right = Math.max(right, bloom);
        }

        while(left < right){
            int mid = left + (right - left) / 2;
            if (feasible(bloomDay, m, k, mid))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    private boolean feasible(int[] bloomDay, int m, int k, int days){
        int bouquets = 0;
        int flowers = 0;

        for(int bloom: bloomDay){
            if(bloom <= days){
                flowers++;
                if(flowers == k){
                    bouquets++;
                    flowers = 0;
                }
            }else
                flowers = 0;
        }
        return bouquets >= m;
    }

}