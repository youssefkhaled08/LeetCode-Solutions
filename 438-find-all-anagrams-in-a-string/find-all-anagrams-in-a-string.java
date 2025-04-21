class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : p.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);

        int left = 0, right = 0;
        int counter = freq.size();

        while (right < s.length()) {
            char endChar = s.charAt(right);

            if (freq.containsKey(endChar)) {
                freq.put(endChar, freq.get(endChar) - 1);

                if (freq.get(endChar) == 0)
                    counter--;
            }

            right++;

            while (counter == 0) {
                if (right - left == p.length())
                    ans.add(left);

                char startChar = s.charAt(left);
                if (freq.containsKey(startChar)) {
                    freq.put(startChar, freq.get(startChar) + 1);

                    if (freq.get(startChar) > 0)
                        counter++;
                }
                left++;
            }
        }
        return ans;
    }
}