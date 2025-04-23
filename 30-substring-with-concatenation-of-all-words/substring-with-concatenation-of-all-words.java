class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();

        if (s.length() == 0 || words.length == 0)
            return ans;

        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : words)
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);

        int wordLen = words[0].length();
        int numOfWords = words.length;
        int windowLen = wordLen * numOfWords;

        // Try all possible starting offsets (0 to wordLen - 1)
        for (int i = 0; i < wordLen; i++) {
            int left = i;
            int right = i;
            Map<String, Integer> seen = new HashMap<>();

            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (wordFreq.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);

                    // Shrink window if word count exceeds expected
                    while (seen.get(word) > wordFreq.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += wordLen;
                    }

                    // If full window matches
                    if (right - left == windowLen)
                        ans.add(left);
                } else {
                    seen.clear();
                    left = right;
                }
            }
        }

        return ans;
    }
}