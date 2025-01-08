class Solution(object):
    def matrixReshape(self, mat, r, c):
        """
        :type mat: List[List[int]]
        :type r: int
        :type c: int
        :rtype: List[List[int]]
        """
        m= len(mat)
        n= len(mat[0])
        if m*n != r*c :
            return mat
        
        flat=[]
        for row in mat:
            flat.extend(row)

            new_matrix=[]
            for i in range(r):
                new_matrix.append(flat[i*c: (i+1)*c])

        return new_matrix