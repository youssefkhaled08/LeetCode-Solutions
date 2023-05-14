import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode id=763 lang=java
 *
 * [763] Partition Labels
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> sizes = new ArrayList<>();
        HashMap<Character, Integer> lastOccurances = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            lastOccurances.put(ch, i);
        }
        
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            end = Math.max(end, lastOccurances.get(ch));
            if (i == end){
                sizes.add(end - start + 1);
                start = end + 1;
            }
        }
    

        return sizes;
    }
}
// @lc code=end

