/*
 * @lc app=leetcode id=3 lang=cpp
 *
 * [3] Longest Substring Without Repeating Characters
 */
// @lc code=start
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_set<char> hashSet;
        int i = 0;
        int j = 0;
        int maximum = 0;
        
        while (j < s.length())
        {
            if (hashSet.find(s[j]) == hashSet.end()){
                hashSet.insert(s[j]);
                j++;
                if(maximum < hashSet.size())
                    maximum = hashSet.size();
            }else{
                hashSet.erase(s[i]);
                i++;
            }
        }

        return maximum;
    }
};
// @lc code=end

