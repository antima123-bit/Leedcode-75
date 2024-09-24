class Solution(object):
    def longestCommonPrefix(self, arr1, arr2):
        """
        :type arr1: List[int]
        :type arr2: List[int]
        :rtype: int
        """
        # Convert integers to strings
        str_arr1 = sorted([str(x) for x in arr1])
        str_arr2 = sorted([str(y) for y in arr2])

        def common_prefix_len(a, b):
            min_len = min(len(a), len(b))
            for i in range(min_len):
                if a[i] != b[i]:
                    return i
            return min_len

        longest_prefix = 0
        
        # Two-pointer approach to compare sorted arrays
        i, j = 0, 0
        while i < len(str_arr1) and j < len(str_arr2):
            # Compare the numbers at current pointers
            longest_prefix = max(longest_prefix, common_prefix_len(str_arr1[i], str_arr2[j]))
            
            # Move the pointer that points to the smaller value to increase the chance of finding a better match
            if str_arr1[i] < str_arr2[j]:
                i += 1
            else:
                j += 1

        return longest_prefix
