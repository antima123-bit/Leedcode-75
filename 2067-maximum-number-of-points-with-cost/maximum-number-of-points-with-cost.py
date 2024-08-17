class Solution(object):
    def maxPoints(self, points):
        """
        :type points: List[List[int]]
        :rtype: int
        """
        m, n = len(points), len(points[0])
        dp = [[0] * n for _ in range(m)]
        
        for j in range(n):
            dp[0][j] = points[0][j]
        
        for i in range(1, m):
            left, right = [0] * n, [0] * n
            for j in range(n):
                if j == 0:
                    left[j] = dp[i-1][j]
                else:
                    left[j] = max(left[j-1] - 1, dp[i-1][j])
            for j in range(n-1, -1, -1):
                if j == n-1:
                    right[j] = dp[i-1][j]
                else:
                    right[j] = max(right[j+1] - 1, dp[i-1][j])
            for j in range(n):
                dp[i][j] = points[i][j] + max(left[j], right[j])
        
        return max(dp[-1])
        