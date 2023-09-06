class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        """
        :type jewels: str
        :type stones: str
        :rtype: int
        """
        count = {}
        sum = 0
        for stone in stones:
            if stone in jewels:
                if stone in count:
                    count[stone] += 1
                else:
                    count[stone] = 1    

        for key in count.keys():
            sum += count[key]
        
        return sum