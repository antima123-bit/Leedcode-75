class Solution(object):
    def diagonalSum(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: int
        """
        n= len(mat)
        total=0
        for i in range(n):
            total += mat[i][i]
            if i!= n-i-1 :
               total+=mat[i][n-i-1]
        return total