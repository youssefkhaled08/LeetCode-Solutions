class Solution(object):
    def totalFruit(self, fruits):
        """
        :type fruits: List[int]
        :rtype: int
        """
        counts = dict()
        left, total, res = 0, 0, 0
        
        for right in range(len(fruits)):
            if fruits[right] in counts.keys():
                counts[fruits[right]] += 1
                total += 1
            else:
                counts[fruits[right]] = 1
                total += 1
            
            while len(counts) > 2:
                fruit = fruits[left]
                total -= 1
                counts[fruit] -= 1
                left += 1
                if not counts[fruit]:
                    counts.pop(fruit)
                    
            res = max(res, total)
        return res