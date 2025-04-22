class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        int counter = 0;
        while (right < fruits.length) {
            int current = fruits[right];
            map.put(current, map.getOrDefault(current, 0) + 1);

            while (map.size() > 2) {
                int temp = fruits[left];
                map.put(temp, map.getOrDefault(temp, 0) - 1);
                if (map.get(temp) == 0)
                    map.remove(temp);
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}