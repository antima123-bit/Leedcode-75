class Solution(object):
    def maxRunTime(self, n, batteries):
        """
        :type n: int
        :type batteries: List[int]
        :rtype: int
        """
        # Here we categorize the value into Max, Min, Mid to rectify the maximum element
        total_energy = sum(batteries)
        low, high = 0, total_energy // n

        while low < high:
            mid = (low + high + 1) // 2

            required_energy = n * mid

            # Now check if the required energy is valid to run the computers
            available_energy = sum(min(b, mid) for b in batteries)
            if available_energy >= required_energy:
                low = mid
            else:
                high = mid - 1
        return low
