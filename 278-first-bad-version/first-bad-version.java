public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                // Mid might be the first bad version, search left half
                right = mid;
            } else {
                // Mid is good, first bad version must be after mid
                left = mid + 1;
            }
        }

        return left; // or right, both point to first bad version
    }
}
