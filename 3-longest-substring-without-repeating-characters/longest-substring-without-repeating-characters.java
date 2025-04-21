class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right < s.length()){
            char curr = s.charAt(right);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            
            while(map.get(curr) > 1){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}