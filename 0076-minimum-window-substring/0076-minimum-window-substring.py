class Solution(object):
    def minWindow(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        table = {}
    
    # Initialize frequency table for t
        for c in t:
            if c in table:
                table[c] += 1
            else:
                table[c] = 1

        # Initialize sliding window
        begin, end = 0, 0
        counter = len(table)
        len_ans = float('inf')

        ans = ""

        # Start sliding window
        while end < len(s):
            end_char = s[end]

            # If the current char is found in the table, decrement the count
            if end_char in table:
                table[end_char] -= 1
                if table[end_char] == 0:
                    counter -= 1

            end += 1

            # If counter == 0, we found an answer, try to trim the window by sliding begin to the right
            while counter == 0:
                # Store the new answer if it's smaller than the previously best
                if end - begin < len_ans:
                    len_ans = end - begin
                    ans = s[begin:end]

                start_char = s[begin]

                # If start_char is in the table, increment its count
                # as we are leaving it out of the window and moving ahead
                if start_char in table:
                    table[start_char] += 1
                    if table[start_char] > 0:
                        counter += 1

                begin += 1
        return ans