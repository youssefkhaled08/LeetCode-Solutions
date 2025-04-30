class Solution {
    public int findKthNumber(int m, int n, int k) {
        int left = 0;
        int right = m * n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (enough(m, n, k, mid))
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    private boolean enough(int m, int n, int k, int num) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(num / i, n);
        }
        return count >= k;
    }

}