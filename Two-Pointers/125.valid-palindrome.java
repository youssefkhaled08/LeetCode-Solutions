/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end){
            char sChar = s.charAt(start);
            char eChar = s.charAt(end);
            if(!Character.isLetterOrDigit(sChar))
                start++;
            else if(!Character.isLetterOrDigit(eChar))
                end--;
            else{
                if(Character.toLowerCase(sChar) != Character.toLowerCase(eChar))
                    return false;
                start++;
                end--;
                }
        }
        return true;
    }
}
// @lc code=end

