#
# @lc app=leetcode id=242 lang=python
#
# [242] Valid Anagram
#

# @lc code=start
class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        hashTable = dict()
        for c in s:
            if c in hashTable:
                hashTable[c] += 1
            else:
                hashTable[c] = 0
        
        for c in t:
            if c in hashTable:
                hashTable[c] += 1
            else:
                hashTable[c] = 0

                
# @lc code=end

