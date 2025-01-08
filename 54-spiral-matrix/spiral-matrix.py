class Solution:
  def spiralOrder(self, matrix):
    if not matrix:
      return []

    m = len(matrix)
    n = len(matrix[0])
    ans = []
    r1 = 0
    c1 = 0
    r2 = m - 1
    c2 = n - 1

    while len(ans) < m * n:
      j = c1
      """Tranverse the top row"""
      while j <= c2 and len(ans) < m * n:
        ans.append(matrix[r1][j])
        j += 1
        """move to next row"""
      i = r1 + 1
      """transverse the right column"""
      while i <= r2 - 1 and len(ans) < m * n:
        ans.append(matrix[i][c2])
        i += 1
      j = c2
      """transverse thebottom column"""
      while j >= c1 and len(ans) < m * n:
        ans.append(matrix[r2][j])
        j -= 1
      i = r2 - 1
      """transverse the left column"""
      while i >= r1 + 1 and len(ans) < m * n:
        ans.append(matrix[i][c1])
        i -= 1
      r1 += 1
      c1 += 1
      r2 -= 1
      c2 -= 1

    return ans