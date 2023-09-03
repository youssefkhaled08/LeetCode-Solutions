/*
 * @lc app=leetcode id=278 lang=cpp
 *
 * [278] First Bad Version
 */

// @lc code=start
// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        
        while (start < end){
            int mid = start + (end - start) / 2;
            
            if(isBadVersion(mid))
                end = mid;
            else
                start = mid + 1;
        }
        
        if (start == end && isBadVersion(start))
            return start;
        
        return -1;
    }
};
// @lc code=end

