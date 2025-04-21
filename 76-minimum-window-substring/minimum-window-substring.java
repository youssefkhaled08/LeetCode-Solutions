import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        
        // Edge Cases
        if(s.length() == 0 || t.length() == 0 || s.length() < t.length())
            return "";
        
        Map<Character, Integer> freq = new HashMap<>();

        for(char c: t.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        
        int left = 0, right = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int counter = freq.size();

        while (right < s.length()){
            char endChar = s.charAt(right);
            
            if(freq.containsKey(endChar)){
                freq.put(endChar, freq.get(endChar) - 1);
                if (freq.get(endChar) == 0)
                    counter--;
            }

            right++;

            while(counter == 0){
                if(right - left < minLen){
                    minLen = right - left;
                    start = left;
                }

                char startChar = s.charAt(left);

                if(freq.containsKey(startChar)){
                    freq.put(startChar, freq.get(startChar) + 1);
                    if(freq.get(startChar) > 0)
                        counter++;
                }
                left++;
            }

        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
