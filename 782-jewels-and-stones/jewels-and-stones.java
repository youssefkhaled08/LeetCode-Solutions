class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> reps = new HashMap<>();

        for (char c: stones.toCharArray()){
            if (reps.containsKey(c)){
                reps.put(c, reps.get(c) + 1);
            }else{
                reps.put(c, 1);
            }
        }

        int total = 0;
        for(char c: jewels.toCharArray()){
            if (reps.containsKey(c)){
                total += reps.get(c);
            }
        }

        return total;
    }
}