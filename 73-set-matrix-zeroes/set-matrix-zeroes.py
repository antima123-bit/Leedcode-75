class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m= len(matrix)
        n=len(matrix[0])
        #this signify that if the first row and col should be equal to zero thenit might be make that particular row and column zero 
        first_row_zero = any(matrix[0][j] == 0 for j in range(n))
        first_col_zero=any(matrix[i][0] == 0 for i in range(m))

        #now make a for loop where we define the row and col
        for i in range(1,m):
            for j in range(1,n):
               if  matrix[i][j]==0:
                   matrix[0][j]=0
                   matrix[i][0] =0

        for i in range(1,m):
            for j in range(1,n):
                if matrix[0][j]==0 or matrix[i][0]==0:
                   matrix[i][j]=0

        if first_row_zero:
           for j in range(n):
            matrix[0][j]=0
        if first_col_zero:
            for i in range(m):
                matrix[i][0]=0





