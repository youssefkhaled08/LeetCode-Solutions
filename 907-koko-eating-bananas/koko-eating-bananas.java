class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for(int pile: piles)
            right = Math.max(right, pile);

        while(left < right){
            int mid = left + (right - left) / 2;

            if(feasible(piles, h, mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }
    private boolean feasible(int[] piles, int h, int speed) {
        int totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile - 1) / speed + 1;  // equivalent to ceil(pile / speed)
        }
        return totalHours <= h;
    }
}