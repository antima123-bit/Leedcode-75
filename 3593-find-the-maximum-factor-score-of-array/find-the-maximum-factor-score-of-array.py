from functools import reduce

class Solution(object):
    def maxScore(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        # Helper function to compute GCD of two numbers
        def gcd(a, b):
            while b:
                a, b = b, a % b
            return a

        # Helper function to compute LCM of two numbers
        def lcm(a, b):
            return abs(a * b) // gcd(a, b)

        # Helper function to compute LCM of a list of numbers
        def lcm_of_list(arr):
            return reduce(lcm, arr, 1)

        # Helper function to compute GCD of a list of numbers
        def gcd_of_list(arr):
            return reduce(gcd, arr)

        n = len(nums)
        
        # Compute the initial GCD and LCM of the whole array
        full_gcd = gcd_of_list(nums)
        full_lcm = lcm_of_list(nums)
        
        # Compute the factor score without removing any element
        max_score = full_gcd * full_lcm
        
        # Now try removing each element one by one and calculate the new score
        for i in range(n):
            # Create a list with the current element removed
            new_nums = nums[:i] + nums[i+1:]
            
            if new_nums:
                # Compute the GCD and LCM of the remaining elements
                current_gcd = gcd_of_list(new_nums)
                current_lcm = lcm_of_list(new_nums)
                
                # Update the maximum factor score
                max_score = max(max_score, current_gcd * current_lcm)
        
        return max_score
