class Solution:
    def spiralOrder(self, matrix):
        if not matrix:
            return []

        # Matrix dimensions
        m = len(matrix)
        n = len(matrix[0])
        ans = []

        # Boundaries
        r1, c1 = 0, 0
        r2, c2 = m - 1, n - 1

        # Traverse the matrix in a spiral order
        while len(ans) < m * n:
            # Traverse the top row
            for j in range(c1, c2 + 1):
                ans.append(matrix[r1][j])
            # Traverse the right column
            for i in range(r1 + 1, r2 + 1):
                ans.append(matrix[i][c2])
            # Traverse the bottom row (if not already visited)
            if r1 < r2:
                for j in range(c2 - 1, c1 - 1, -1):
                    ans.append(matrix[r2][j])
            # Traverse the left column (if not already visited)
            if c1 < c2:
                for i in range(r2 - 1, r1, -1):
                    ans.append(matrix[i][c1])

            # Move the boundaries inward
            r1 += 1
            c1 += 1
            r2 -= 1
            c2 -= 1

        return ans
