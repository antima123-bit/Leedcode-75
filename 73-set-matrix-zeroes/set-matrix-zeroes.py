class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        if not matrix:
            return
        
        rows, cols = len(matrix), len(matrix[0])
        first_row_zero = False
        first_col_zero = False
        
        # Step 1: Check if the first row needs to be set to zero
        for j in range(cols):
            if matrix[0][j] == 0:
                first_row_zero = True
                break
        
        # Step 2: Check if the first column needs to be set to zero
        for i in range(rows):
            if matrix[i][0] == 0:
                first_col_zero = True
                break
        
        # Step 3: Mark rows and columns to be set to zero using first row and first column
        for i in range(1, rows):
            for j in range(1, cols):
                if matrix[i][j] == 0:
                    matrix[i][0] = 0
                    matrix[0][j] = 0
        
        # Step 4: Set cells to zero based on marks in the first row and first column
        for i in range(1, rows):
            for j in range(1, cols):
                if matrix[i][0] == 0 or matrix[0][j] == 0:
                    matrix[i][j] = 0
        
        # Set first row to zero if needed
        if first_row_zero:
            for j in range(cols):
                matrix[0][j] = 0
        
        # Set first column to zero if needed
        if first_col_zero:
            for i in range(rows):
                matrix[i][0] = 0
