class Solution(object):
    def findAnagrams(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: List[int]
        """
        if len(s) < len(p) or len(s) == 0:
            return []
        
        indicies = list()
        table = dict()
        begin = end = 0
    
        
        for c in p:
            table[c] = 1 + table.get(c, 0)
    
        count = len(table)
        window = len(p)
        
        while end < len(s):
            endChar = s[end]
            
            if endChar in table:
                table[endChar] -= 1
                if table[endChar] == 0:
                    count -= 1
            end += 1
            while count == 0:
                if end - begin == window:
                    indicies.append(begin)
                    
                startChar = s[begin]
                if startChar in table:
                    table[startChar] += 1
                    if table[startChar] > 0:
                        count += 1
                begin += 1
        return indicies